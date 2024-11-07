package br.edu.utfpr.api_categoria.repositories;

import br.edu.utfpr.api_categoria.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
