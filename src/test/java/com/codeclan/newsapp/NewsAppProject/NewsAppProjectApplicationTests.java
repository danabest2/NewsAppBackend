package com.codeclan.newsapp.NewsAppProject;

import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAppProjectApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Test
	public void contextLoads() {
	}

	//@Test
	//public void canGetCategoryName(){
		//assertEquals("Politics", getName());
	//}


}

//	Journalist journalist = new Journalist("B", "a");
//        journalistRepository.save(journalist);
//
//				Category category = new Category("Politics");
//				categoryRepository.save(category);
//
//				Article article = new Article("Great news", 3, "More great news", "really great news",  journalist, "www.greatpic.com");
//				articleRepository.save(article);
