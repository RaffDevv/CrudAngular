package com.loiane.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data                     //Gera Getters e Setters
@Entity

public class Course {

  @Id                     // id como chave primaria
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Long id;

  //@Column(name = "nome") => anotação para setar informações, nome/tamanho das colunas
  @Column(length = 200, nullable = false)
  private String name;

  @Column(length = 10, nullable = false)
  private String category;

}
