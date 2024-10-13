package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Novela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovelaRepo extends JpaRepository<Novela, Integer> {
}
