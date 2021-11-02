package br.com.res.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.res.domain.Produto;




@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	
	
}