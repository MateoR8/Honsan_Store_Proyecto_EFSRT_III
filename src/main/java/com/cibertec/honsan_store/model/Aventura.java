package com.cibertec.honsan_store.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TB_Aventura")
@Data
@Getter
@Setter
public class Aventura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "codigo_libro", length = 10, nullable = false)
    private String codigoLibro;

    @Column(name = "titulo_libro", length = 70, nullable = false)
    private String tituloLibro;

    @Column(name = "genero_libro", length = 20, nullable = false)
    private String generoLibro;

    @Column(name = "autor_libro", length = 100, nullable = false)
    private String autorLibro;

    @Column(name = "anio_lanzamiento", nullable = false)
    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date anioLanzamiento;

    @Column(name = "precio_libro", scale = 2, nullable = false)
    private BigDecimal precioLibro;

    @Column(name = "stock_libro", nullable = false)
    private Integer stockLibro;

}
