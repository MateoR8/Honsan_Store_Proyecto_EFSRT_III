package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Aventura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AventuraRepo extends JpaRepository<Aventura, Integer> {
}
