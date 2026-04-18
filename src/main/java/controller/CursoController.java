package com.vivianacalderon.cursos.controller;

import com.vivianacalderon.cursos.model.Curso;
import com.vivianacalderon.cursos.repository.CursoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@Tag(name = "Cursos", description = "API creada por Vivian Calderón")
public class CursoController {

    @Autowired
    private CursoRepository repository;

    @Operation(summary = "Ver todos los cursos")
    @GetMapping
    public List<Curso> listar() {
        return repository.findAll();
    }

    @Operation(summary = "Crear un nuevo curso")
    @PostMapping
    public Curso guardar(@RequestBody Curso curso) {
        return repository.save(curso);
    }

    @Operation(summary = "Borrar un curso por ID")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
