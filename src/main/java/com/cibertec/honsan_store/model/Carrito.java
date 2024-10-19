package com.cibertec.honsan_store.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Setter
@Getter
public class Carrito {
    private String codigoLibro;
    private String tituloLibro;
    private BigDecimal precioLibro;
}
