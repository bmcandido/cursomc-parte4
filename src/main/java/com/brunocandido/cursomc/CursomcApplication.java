package com.brunocandido.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Teste
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner { // Acrescentei o implemento CommandLineRunner serve para
																// Dar o Start no Banco nas opçoes de tabelas
																// cadastradas conforme exemplo abaixo

	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	
	
	}

}
