package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.CienciaFiccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CienciaFiccionRepo extends JpaRepository<CienciaFiccion, Integer> {
}
