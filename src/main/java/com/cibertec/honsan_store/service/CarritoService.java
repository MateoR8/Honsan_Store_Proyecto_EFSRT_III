package com.cibertec.honsan_store.service;

import com.cibertec.honsan_store.model.Carrito;

import java.util.List;

public interface CarritoService {

    List<Carrito> listarInfo();

    public void guardarInfo(Carrito carrito);

    void eliminarCarritoporId(int id);

    void eliminarCarritoCompleto();

}
