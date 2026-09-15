package com.br.edu.nassau.api_cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.edu.nassau.api_cursos.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
