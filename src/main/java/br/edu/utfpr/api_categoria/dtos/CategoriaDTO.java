package br.edu.utfpr.api_categoria.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CategoriaDTO(
        Long id,

        @NotBlank
        @Size(min = 3, max = 50)
        String name,

        @NotNull
        Boolean active
) {}