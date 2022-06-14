package com.spring.demo.services;


import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorServices {
    AuthorDTO createAuthor(AuthorDTO authorDTO);

    Author updateAuthor(AuthorDTO authorDTO);

    List<Author> findAllAuthor();

    public void deleteAuthorById(Long id);

    Optional<Author> findById(Long id);

    Author updateById(Long id);
}
