package com.edu.fatec.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.edu.fatec.entidades.Produto;

@Component
public class ProdutoSelecionado {
	public Produto selecionar(List<Produto> produtos, long id) {
		Produto selecionado = null;
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				selecionado = produto;
			}
		}
		return selecionado;
	}
}

