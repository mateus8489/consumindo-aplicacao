package br.com.res.domain;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Produto {
	
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	
	@ManyToMany
	private Categoria categoria;
	
	public Produto(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}