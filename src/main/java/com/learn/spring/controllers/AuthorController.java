package com.learn.spring.controllers;


import com.learn.spring.dto.AuthorDto;
import com.learn.spring.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto author){

        AuthorDto newAuthor = authorService.createAuthor(author);
        return new ResponseEntity<>(newAuthor, HttpStatus.CREATED);
    }
}
