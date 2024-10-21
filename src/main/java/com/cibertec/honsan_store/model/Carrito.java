package com.cibertec.honsan_store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_Carrito")
@Data
@Setter
@Getter
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Integer idCarrito;

    @Column(name = "codigo_carrito", length = 50, nullable = false)
    private String codigoLibro;

    @Column(name = "titulo_carrito", length = 50, nullable = false)
    private String tituloLibro;

    @Column(name = "precio_libro", scale = 2, nullable = false)
    private BigDecimal precioLibro;

    public Carrito(String codigo, String titulo, BigDecimal precio) {
        this.codigoLibro = codigo;
        this.tituloLibro = titulo;
        this.precioLibro = precio;
    }

    public Carrito() {
        // Constructor por defecto
    }
}
