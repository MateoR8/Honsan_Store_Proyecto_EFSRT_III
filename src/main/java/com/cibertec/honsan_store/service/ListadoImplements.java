package com.cibertec.honsan_store.service;

import com.cibertec.honsan_store.model.*;
import com.cibertec.honsan_store.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListadoImplements implements ListadoService {

    private final AutoAyudaRepo autoAyuda;
    private final AventuraRepo aventura;
    private final CienciaFiccionRepo cienciaFiccion;
    private final ComicRepo comic;
    private final FantasiaRepo fantasia;
    private final HorrorRepo horror;
    private final InfantilRepo infantil;
    private final MangaRepo manga;
    private final NovelaRepo novela;
    private final RomanceRepo romance;

    @Override
    public List<AutoAyuda> listarAutoAyuda() {
        return autoAyuda.findAll();
    }

    @Override
    public List<Aventura> listarAventura() {
        return aventura.findAll();
    }

    @Override
    public List<CienciaFiccion> listarCienciaFiccion() {
        return cienciaFiccion.findAll();
    }

    @Override
    public List<Comic> listarComic() {
        return comic.findAll();
    }

    @Override
    public List<Fantasia> listarFantasia() {
        return fantasia.findAll();
    }

    @Override
    public List<Horror> listarHorror() {
        return horror.findAll();
    }

    @Override
    public List<Infantil> listarInfantil() {
        return infantil.findAll();
    }

    @Override
    public List<Manga> listarManga() {
        return manga.findAll();
    }

    @Override
    public List<Novela> listarNovela() {
        return novela.findAll();
    }

    @Override
    public List<Romance> listarRomance() {
        return romance.findAll();
    }
}
