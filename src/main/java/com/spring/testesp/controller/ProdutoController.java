package com.spring.testesp.controller;

import com.spring.testesp.model.entities.Produto;
import com.spring.testesp.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/obter")
    public List<Produto> obterTodos(){
        return this.produtoService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Produto obterPorCodigo(@PathVariable String id){
        return this.produtoService.ObterPorCodigo(id);
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto){

        System.out.println(produto);
        return this.produtoService.criar(produto);

    }


}
