package com.example.crudproduto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudproduto.model.Produto;
import com.example.crudproduto.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/produtos")
	public List<Produto> getProdutos() {
		return produtoService.getAll();
	}

	@GetMapping("/produtos/{id}")
	public Produto findById(@PathVariable Long id) {
		return produtoService.getById(id);
	}

	@PostMapping("/produtos")
	public Produto save(@RequestBody Produto produto) {
		return produtoService.save(produto);
	}

}
