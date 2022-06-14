package com.spring.demo.controller;

import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Author;
import com.spring.demo.services.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AuthorController {
    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/author")
    public ResponseEntity<List<Author>> getAllAuthor() {
        return ResponseEntity.ok().body(authorService.findAllAuthor());
    }

    @PostMapping("/createAuthor")
    public ResponseEntity<AuthorDTO> create(@RequestBody AuthorDTO authorDTO) {
        AuthorDTO author = authorService.createAuthor(authorDTO);
        return ResponseEntity.ok().body(author);
    }

    @DeleteMapping(value = "author/{id}")
    public String deleteBookById(@PathVariable("id") Long id) {
        authorService.deleteAuthorById(id);
        return "delete successfull";
    }

    @PutMapping("/author/{id}")
    public ResponseEntity<Author> UpdateById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(authorService.updateById(id));
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Optional<Author>> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(authorService.findById(id));
    }

}
