package com.globotech.Globo.Tech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ConsultaInvalidaException extends Exception{
    public ConsultaInvalidaException(Integer id){
        super(String.format("Nenhum livro encontrado com id=%d, favor verifique o id informado e refaça sua busca.",
                id));
    }
}
