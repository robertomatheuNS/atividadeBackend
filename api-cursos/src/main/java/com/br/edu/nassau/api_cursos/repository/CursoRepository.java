package com.br.edu.nassau.api_cursos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.br.edu.nassau.api_cursos.model.Curso;

@Repository
public class CursoRepository {

    private final List<Curso> cursos = new ArrayList<>();

    public Curso cadastrar(Curso curso) {
        cursos.add(curso);
        return curso;
    }

    public List<Curso> listar() {
        return cursos;
    }

    public Curso buscarPorId(Long id) {
        for (Curso curso : cursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        return null;
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {

        Curso curso = buscarPorId(id);

        if (curso == null) {
            return null;
        }

        curso.setNome(cursoAtualizado.getNome());
        curso.setCargaHoraria(cursoAtualizado.getCargaHoraria());

        return curso;
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
}
