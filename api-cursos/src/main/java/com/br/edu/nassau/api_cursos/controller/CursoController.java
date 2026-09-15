package com.br.edu.nassau.api_cursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.edu.nassau.api_cursos.model.Curso;
import com.br.edu.nassau.api_cursos.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoservice;

    public CursoController(CursoService cursoservice) {
        this.cursoservice = cursoservice;
    }

    @GetMapping("/menssagem")
    public String messagem() {
        return cursoservice.messagem();
    }

    @PostMapping("/cadastrarcurso")
    public Curso cadastrar(@RequestBody Curso curso) {
        return cursoservice.cadastrar(curso);
    }

    @GetMapping("/listar")
    public List<Curso> listar() {
        return cursoservice.listar();
    }

    @GetMapping("/buscar/{id}")
    public Curso buscarPorId(@PathVariable Long id) {
        return cursoservice.buscarPorId(id);
    }

    @PostMapping("/atualizar/{id}")
    public Curso atualizar(@PathVariable Long id, @RequestBody Curso cursoAtualizado) {
        return cursoservice.atualizar(id, cursoAtualizado);
    }

    @DeleteMapping("/remover/{id}")
    public void removerCurso(@PathVariable Long id) {
        cursoservice.removerCurso(id);
    }

}
