package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Horror;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorrorRepo extends JpaRepository<Horror, Integer> {
}
