package com.spring.testesp.model.repositories;

import com.spring.testesp.model.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {

}
