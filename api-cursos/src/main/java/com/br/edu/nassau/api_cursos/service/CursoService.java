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
        return cursoRepository.cadastrar(curso);
    }

    public List<Curso> listar() {
        return cursoRepository.listar();
    }

    public Curso buscarPorId(Long id) {
        return cursoRepository.buscarPorId(id);
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {
        return cursoRepository.atualizar(id, cursoAtualizado);
    }

    public void removerCurso(Long id) {
        cursoRepository.removerCurso(buscarPorId(id));
    }

}
