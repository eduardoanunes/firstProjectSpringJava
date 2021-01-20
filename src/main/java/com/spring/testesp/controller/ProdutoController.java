package com.spring.testesp.controller;

import com.spring.testesp.model.entities.Produto;
import com.spring.testesp.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/obter")
    @ResponseStatus(OK)
    public List<Produto> obterTodos(){
        return this.produtoService.obterTodos();
    }

    @GetMapping("/{codigo}")
    @ResponseStatus(OK)
    public Produto obterPorCodigo(@PathVariable String id){
        return this.produtoService.ObterPorCodigo(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto criar(@RequestBody Produto produto){
        return this.produtoService.criar(produto);

    }
    @DeleteMapping("/excluir/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirProduto(@PathVariable String id){
        produtoService.excluirProduto(id);

    }



}
