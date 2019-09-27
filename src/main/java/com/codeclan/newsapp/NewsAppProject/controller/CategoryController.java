package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;


}
