package com.globotech.Globo.Tech.controller;

import com.globotech.Globo.Tech.entity.Livro;
import com.globotech.Globo.Tech.request.LivroRequest;
import com.globotech.Globo.Tech.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLivro(@RequestBody @Valid LivroRequest livroRequest) throws Exception {
        this.livroService.cadastrarLivro(livroRequest);
    }

    @GetMapping(path = "/{id}")
    public Livro consultarLivro(@PathVariable @Valid Integer id) throws Exception{
        return this.livroService.consultarLivro(id);

    }

    @GetMapping
    public List<Livro> consultarLivros() throws Exception {
        return this.livroService.listarTodos();
    }


}
