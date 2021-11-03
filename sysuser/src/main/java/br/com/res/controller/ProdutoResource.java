package br.com.res.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.res.domain.Produto;
import br.com.res.service.ProdutoService;

@RestController
@RequestMapping("/api/user")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	

	
	@GetMapping("/produto")public ResponseEntity<List<Produto>> obterListaProduto(){
		return new ResponseEntity<List<Produto>>(service.listarTodos(), HttpStatus.OK);
	}
	
	public List<Produto> listaTodosProduto(){
	List<Produto>users = service.listarTodos();
	return users;	
	}
	
	
	}
