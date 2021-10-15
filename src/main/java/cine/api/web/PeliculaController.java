package cine.api.web;

import cine.api.model.Pelicula;
import cine.api.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Pelicula")
public class PeliculaController {

    @Autowired
    PeliculaService peliculaService;

    @GetMapping("/todas")
    public List<Pelicula> getPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

}
