package com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
