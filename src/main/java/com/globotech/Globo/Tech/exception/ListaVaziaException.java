package com.globotech.Globo.Tech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ListaVaziaException extends Exception {
    public ListaVaziaException(){
        super("Lista Vazia");
    }

}
