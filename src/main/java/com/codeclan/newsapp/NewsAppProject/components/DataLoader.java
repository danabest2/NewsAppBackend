package com.codeclan.newsapp.NewsAppProject.components;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Journalist journalist = new Journalist( "josh", "John");
        journalistRepository.save(journalist);

        Category category = new Category("Politics");
        categoryRepository.save(category);

        Article article = new Article("Great news", 3, "More great news", "really great news",  journalist, "www.greatpic.com", "2018-10-15", "politics");
        articleRepository.save(article);
    }
}

//    Article(String title, int rating, String summary, String content, Journalist journalist, String picUrl)
