package com.example.crudproduto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crudproduto.model.Produto;
import com.example.crudproduto.repository.ProdutoRepository;

@Service
public class ProdutoService {
	

	private ProdutoRepository produtoRepository;

		
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public List<Produto> getAll() {
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public Produto getById(Long id) {
		return produtoRepository.findById(id).get();
	}
	
	
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	

}
