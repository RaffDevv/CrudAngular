package com.loiane.crudspring.controller;

import com.loiane.crudspring.repository.CourseRepository;
import com.loiane.crudspring.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor //construtor lombok

public class CourseController {


  private CourseRepository courseRepository;


  @GetMapping
  public List<Course> list() {
    return courseRepository.findAll();
  }

}


