package com.vivianacalderon.cursos.repository;

import com.vivianacalderon.cursos.model.Curso; // ESTO ES CLAVE: Conecta el repo con tu clase Curso
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}