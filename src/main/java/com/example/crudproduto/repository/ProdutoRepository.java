package com.example.crudproduto.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crudproduto.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
