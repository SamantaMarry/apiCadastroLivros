package com.globotech.Globo.Tech.service;

import com.globotech.Globo.Tech.exception.ConsultaInvalidaException;
import com.globotech.Globo.Tech.exception.ListaVaziaException;
import com.globotech.Globo.Tech.exception.livroCadastradoException;
import com.globotech.Globo.Tech.entity.Livro;
import com.globotech.Globo.Tech.repository.LivroRepository;
import com.globotech.Globo.Tech.request.LivroRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;


    public Livro cadastrarLivro (LivroRequest livroRequest) throws livroCadastradoException {
        final List<Livro> livrosCadastrados = (List<Livro>) repository.findAll();

        for ( Livro livroCadastrado : livrosCadastrados){
            if (livroCadastrado.getTitulo().equalsIgnoreCase(livroRequest.getTitulo()) &&
                    livroCadastrado.getAutor().equalsIgnoreCase(livroRequest.getAutor())){
                throw new livroCadastradoException();

            }

        }

        Livro livro = new Livro (livroRequest.getAutor(), livroRequest.getTitulo(), livroRequest.getPaginas());
        repository.save(livro);
        return livro;

    }



    public Livro consultarLivro(Integer id) throws Exception{

        final List<Livro> livros = (List<Livro>) repository.findAll();
        for (Livro livro : livros){
            if (livro.getId().equals(id)){
                return livro;
            }
        }

        throw new ConsultaInvalidaException(id);

    }


    public List<Livro> listarTodos() throws Exception {

        final List<Livro> livros = (List<Livro>) repository.findAll();

        if (livros.isEmpty()) {
            throw new ListaVaziaException();
        }

        return livros;
    }
}
