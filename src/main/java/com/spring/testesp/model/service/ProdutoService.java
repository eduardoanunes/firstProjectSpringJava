package com.spring.testesp.model.service;

import com.spring.testesp.model.entities.Produto;
import com.spring.testesp.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        return this.produtoRepository.findAll();
    }

    public Produto ObterPorCodigo(String id) {
        return this.produtoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Produto nao existe!"));
    }

    public Produto criar(Produto produto) {
        return this.produtoRepository.save(produto);
    }


    public void excluirProduto (String id){
        produtoRepository.deleteById(id);

    }
    public Produto alterarProduto(Produto produto){
        return this.produtoRepository.save(produto);
    }
}
