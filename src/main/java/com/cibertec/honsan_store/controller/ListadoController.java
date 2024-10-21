package com.cibertec.honsan_store.controller;


import com.cibertec.honsan_store.model.Carrito;
import com.cibertec.honsan_store.service.CarritoService;
import com.cibertec.honsan_store.service.ListadoService;
import jakarta.persistence.EntityManager;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/libros")
@RequiredArgsConstructor
public class ListadoController {

    private final ListadoService listadoService;
    private final CarritoService carritoService;
    private final EntityManager entityManager;

    @GetMapping("/principal")
    public String PaginaPrincipal() {
        return "libros/PaginaPrincipal";
    }

    @GetMapping("/carrito")
    public String CarritoCompra() {
        return "libros/Carrito";
    }

    @GetMapping("/usuario")
    public String User() {
        return "libros/Usuario";
    }

    @GetMapping("/listarAutoAyuda")
    public String listarAutoAyuda(Model model) {
        model.addAttribute("listadoAutoAyuda", listadoService.listarAutoAyuda());
        return "libros/autoAyuda";
    }

    @GetMapping("/listarAventura")
    public String listarAventura(Model model) {
        model.addAttribute("listarAventura", listadoService.listarAventura());
        return "libros/aventura";
    }

    @GetMapping("/listarCienciaFiccion")
    public String listarCienciaFiccion(Model model) {
        model.addAttribute("listarCienciaFiccion", listadoService.listarCienciaFiccion());
        return "libros/cienciaFiccion";
    }

    @GetMapping("/listarComic")
    public String listarComic(Model model) {
        model.addAttribute("listarComic", listadoService.listarComic());
        return "libros/comic";
    }

    @GetMapping("/listarFantasia")
    public String listarFantasia(Model model) {
        model.addAttribute("listarFantasia", listadoService.listarFantasia());
        return "libros/fantasia";
    }

    @GetMapping("/listarHorror")
    public String listarHorror(Model model) {
        model.addAttribute("listarHorror", listadoService.listarHorror());
        return "libros/horror";
    }

    @GetMapping("/listarInfantil")
    public String listarInfantil(Model model) {
        model.addAttribute("listarInfantil", listadoService.listarInfantil());
        return "libros/infantil";
    }

    @GetMapping("/listarManga")
    public String listarManga(Model model) {
        model.addAttribute("listarManga", listadoService.listarManga());
        return "libros/manga";
    }

    @GetMapping("/listarNovela")
    public String listarNovela(Model model) {
        model.addAttribute("listarNovela", listadoService.listarNovela());
        return "libros/novela";
    }

    @GetMapping("/listarRomance")
    public String listarRomance(Model model) {
        model.addAttribute("listarRomance", listadoService.listarRomance());
        return "libros/romance";
    }

    @GetMapping("/listadoCarrito")
    public String listarCarrito(Model model) {

        List<Carrito> carritoCompra = carritoService.listarInfo();

        BigDecimal totalPrecio = carritoCompra.stream()
                .map(Carrito::getPrecioLibro)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        model.addAttribute("carritoCompra", carritoCompra);
        model.addAttribute("totalPrecio", totalPrecio);

        return "libros/Carrito";
    }

    @GetMapping("/agregarCarrito")
    public String agregarCarrito(@RequestParam("codigo") String codigo, @RequestParam("titulo") String titulo, @RequestParam("precio") BigDecimal precio) {
        Carrito carrito = new Carrito(codigo, titulo, precio);
        carritoService.guardarInfo(carrito);
        return "libros/PaginaPrincipal";
    }

    @GetMapping("/vaciarCarrito")
    public String vaciarCarrito() {
        carritoService.eliminarCarritoCompleto();
        return "redirect:/libros/listadoCarrito";
    }

    @GetMapping("/eliminarItem/{id}")
    public String eliminarItem(@PathVariable("id") Integer id) {
        carritoService.eliminarCarritoporId(id);
        return "redirect:/libros/listadoCarrito";
    }

    @GetMapping("/reporteEmpleados")
    public void reporteEmpleados(HttpServletResponse response) throws JRException, SQLException, IOException {
        // Obtén la conexión JDBC desde el EntityManager
        Session session = entityManager.unwrap(Session.class);
        Connection conn = session.doReturningWork(connection -> connection.unwrap(Connection.class));

        // Cargar el reporte .jasper
        InputStream jasperStream = this.getClass().getResourceAsStream("/reportes/rptHonsan.jasper");
        Map<String, Object> params = new HashMap<>();

        // Cargar el reporte
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);

        // Llenar el reporte con la conexión JDBC obtenida
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);

        // Configuración para devolver el reporte PDF en la respuesta HTTP
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "inline; filename=productos_report.pdf");

        // Enviar el reporte como respuesta
        final OutputStream outputStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

        // Cerrar la conexión
        conn.close();
    }


}
