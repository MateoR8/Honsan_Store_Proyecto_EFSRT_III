package com.cibertec.honsan_store.service;

import com.cibertec.honsan_store.model.*;

import java.util.List;

public interface ListadoService {

    List<AutoAyuda> listarAutoAyuda();

    List<Aventura> listarAventura();

    List<CienciaFiccion> listarCienciaFiccion();

    List<Comic> listarComic();

    List<Fantasia> listarFantasia();

    List<Horror> listarHorror();

    List<Infantil> listarInfantil();

    List<Manga> listarManga();

    List<Novela> listarNovela();

    List<Romance> listarRomance();

}
