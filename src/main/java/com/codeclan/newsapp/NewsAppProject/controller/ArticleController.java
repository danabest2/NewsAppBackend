package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;
}
