package com.edu.fatec.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.fatec.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}

