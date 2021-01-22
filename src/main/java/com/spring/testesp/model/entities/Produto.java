package com.spring.testesp.model.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data @Document
public class Produto {
    @Id
    private String id;
    @Field("Nome")
    private String nome;
    @Field("Preco")
    private double preco;
    @Field("Quantidade")
    private int quantidade;
}
