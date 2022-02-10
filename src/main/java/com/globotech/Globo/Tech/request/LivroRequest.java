package com.globotech.Globo.Tech.request;

import javax.validation.constraints.NotNull;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LivroRequest {

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo TÍTULO")
    private String titulo;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o Campo AUTOR")
    private String autor;

    private Integer paginas;

}
