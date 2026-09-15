package com.br.edu.nassau.api_cursos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.edu.nassau.api_cursos.model.Curso;
import com.br.edu.nassau.api_cursos.repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public String messagem() {
        return "saudação terráqueos";
    }

    public Curso cadastrar(Curso curso) {

        if (curso.getNome() == null || curso.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do curso é obrigatório");
        }

        if (curso.getCargaHoraria() == null || curso.getCargaHoraria() <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero");
        }

        return cursoRepository.save(curso);
    }

    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {

        if (cursoAtualizado.getNome() == null || cursoAtualizado.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do curso é obrigatório");
        }

        if (cursoAtualizado.getCargaHoraria() == null || cursoAtualizado.getCargaHoraria() <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero");
        }

        Curso curso = cursoRepository.findById(id).orElse(null);

        if (curso == null) {
            return null;
        }

        curso.setNome(cursoAtualizado.getNome());
        curso.setCargaHoraria(cursoAtualizado.getCargaHoraria());

        return cursoRepository.save(curso);
    }

    public void removerCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
