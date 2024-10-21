package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepo extends JpaRepository<Carrito, Integer> {
}
