package com.spring.demo.dao;

import com.spring.demo.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AuthorRepository extends MongoRepository<Author, Long> {
}
