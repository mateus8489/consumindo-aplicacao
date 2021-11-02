package br.com.res.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.res.domain.Produto;
import br.com.res.repository.ProdutoRepository;



@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
}
