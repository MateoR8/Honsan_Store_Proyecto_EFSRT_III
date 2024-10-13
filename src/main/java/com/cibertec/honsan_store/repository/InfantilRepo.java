package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Infantil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfantilRepo extends JpaRepository<Infantil, Integer> {
}
