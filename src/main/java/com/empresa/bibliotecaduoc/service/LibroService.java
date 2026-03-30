package com.empresa.bibliotecaduoc.service;

import com.empresa.bibliotecaduoc.model.Libro;
import com.empresa.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getLibro(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        return libroRepository.eliminar(id);
    }

    public Libro getLibroPorIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }

    public int totalLibros() {
        return libroRepository.totalLibros();
    }
}