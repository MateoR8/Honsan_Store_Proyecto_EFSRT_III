package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.AutoAyuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoAyudaRepo extends JpaRepository<AutoAyuda, Integer> {
}
