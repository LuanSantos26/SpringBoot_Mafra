package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PrimeiroProjetoSpringApplication {
	
		@PostMapping("/contato")
		public String criarContato() {
			return " Contato criado com sucesso !";
		}
		
		
		@GetMapping("/visualizar")
		public String verContato() {
			return " Contato visualizado com sucesso !";
		}
		
		@DeleteMapping("/deletar")
		public String deletarContato() {
			return "Contato excluido com sucesso !";
		}
		
		@PutMapping("/atualizar")
		public String atualizarContato() {
			return "Contato atualizado com sucesso !";
		}

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

}
