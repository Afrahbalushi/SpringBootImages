package com.example.springbootwithImage.code;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepositoryNew extends JpaRepository<Image, Long> {
}
