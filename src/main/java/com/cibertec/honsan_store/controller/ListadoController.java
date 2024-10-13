package com.cibertec.honsan_store.controller;


import com.cibertec.honsan_store.service.ListadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libros")
@AllArgsConstructor
public class ListadoController {

    private final ListadoService listadoService;

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

}
