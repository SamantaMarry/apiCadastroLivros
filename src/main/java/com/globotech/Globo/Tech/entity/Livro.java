package com.globotech.Globo.Tech.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Livro {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private String autor;
    private Integer paginas;


    public Livro(String autor, String titulo, Integer paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;

    }
}