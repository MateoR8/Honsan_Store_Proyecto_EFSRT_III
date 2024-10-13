package com.cibertec.honsan_store.repository;

import com.cibertec.honsan_store.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaRepo extends JpaRepository<Manga, Integer> {
}
