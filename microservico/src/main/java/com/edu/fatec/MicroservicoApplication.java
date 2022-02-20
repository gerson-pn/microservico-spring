package com.edu.fatec;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.edu.fatec.entidades.Produto;
import com.edu.fatec.repositorios.ProdutoRepositorio;

@SpringBootApplication
public class MicroservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicoApplication.class, args);

	}

	@Component
	public static class Runner implements ApplicationRunner {

		@Autowired
		public ProdutoRepositorio repositorio;

		@Override
		public void run(ApplicationArguments args) throws Exception {
			Calendar calendario = Calendar.getInstance();
			calendario.set(2020, 11, 15);

			Produto produto = new Produto();
			produto.setNome("Refrigerante 2LT");
			produto.setDataFabricacao(calendario.getTime());

			repositorio.save(produto);

		}
	}
}