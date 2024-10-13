package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepo extends JpaRepository<Comic, Integer> {
}