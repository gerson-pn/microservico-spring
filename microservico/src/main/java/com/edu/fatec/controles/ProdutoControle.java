package com.edu.fatec.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.fatec.entidades.Produto;
import com.edu.fatec.modelo.ProdutoSelecionado;
import com.edu.fatec.repositorios.ProdutoRepositorio;

@RestController
public class ProdutoControle {
	@Autowired
	private ProdutoRepositorio repositorio;
	@Autowired
	private ProdutoSelecionado selecionador;

	@PostMapping("/inserir/produto")
	public void inserirProduto(@RequestBody Produto produto) {
		repositorio.save(produto);
	}

	@GetMapping("/produtos")
	public List<Produto> recuperarTodosProdutos() {
		return repositorio.findAll();
	}

	@GetMapping("/produto/{id}")
	public Produto recuperarProdutoPorId(@PathVariable long id) {
		List<Produto> produtos = repositorio.findAll();
		return selecionador.selecionar(produtos, id);
	}
}


