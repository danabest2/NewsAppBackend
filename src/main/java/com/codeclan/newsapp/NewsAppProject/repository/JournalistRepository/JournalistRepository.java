package com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository;

import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist, Long> {
}
