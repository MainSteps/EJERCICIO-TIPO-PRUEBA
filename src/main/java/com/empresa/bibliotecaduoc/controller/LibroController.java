package com.empresa.bibliotecaduoc.controller;

import com.empresa.bibliotecaduoc.model.Libro;
import com.empresa.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listaLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibro(id);
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscarPorIsbn(@PathVariable String isbn) {
        return libroService.getLibroPorIsbn(isbn);
    }

    @GetMapping("/total")
    public int totalLibros() {
        return libroService.totalLibros();
    }

    @GetMapping("/autor/{autorX}")
    public List<Libro> buscarPorAutorX(@PathVariable String autorX){
        return libroService.autorLibro(autorX);
    }

}