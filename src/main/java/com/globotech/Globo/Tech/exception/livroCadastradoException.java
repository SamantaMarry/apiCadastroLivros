package com.globotech.Globo.Tech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class livroCadastradoException extends Exception {
    public livroCadastradoException(){
        super("Livro já cadastrado!");
    }

}
