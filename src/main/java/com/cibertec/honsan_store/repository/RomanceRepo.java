package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Romance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RomanceRepo extends JpaRepository<Romance, Integer> {
}
