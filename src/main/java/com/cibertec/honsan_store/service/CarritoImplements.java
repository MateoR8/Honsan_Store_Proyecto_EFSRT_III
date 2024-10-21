package com.cibertec.honsan_store.service;

import com.cibertec.honsan_store.model.Carrito;
import com.cibertec.honsan_store.repository.CarritoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarritoImplements implements CarritoService{

    private final CarritoRepo carritoRepo;

    @Override
    public List<Carrito> listarInfo() {
        return carritoRepo.findAll();
    }

    @Override
    public void guardarInfo(Carrito carrito) {
        carritoRepo.save(carrito);
    }

    @Override
    public void eliminarCarritoporId(int id) {
        if (carritoRepo.existsById(id)) {
            carritoRepo.deleteById(id);
        } else {
            throw new RuntimeException("No se puede eliminar el libro");
        }
    }

    @Override
    public void eliminarCarritoCompleto() {
        carritoRepo.deleteAll();
    }
}
