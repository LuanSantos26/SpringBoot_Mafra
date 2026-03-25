package com.example.demo.controller;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contato;

@RestController
public class ContatoController {
	List<Contato> contatos = new ArrayList<Contato>();
	@PostMapping("/contato")
	public String postContato(@RequestBody Contato contato) {
		contatos.add(contato);
		return " Contato criado com sucesso !";
	}
	
	
	@GetMapping("/consultar")
	public List<Contato> getContato() {
		return contatos ;
	}
	
	@DeleteMapping("/deletar")
	public String deleteContato() {
		return "Contato excluido com sucesso !";
	}
	
	@PutMapping("/atualizar")
	public String putContato() {
		return "Contato atualizado com sucesso !";
	}
}
