package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Fantasia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FantasiaRepo extends JpaRepository<Fantasia, Integer> {
}

