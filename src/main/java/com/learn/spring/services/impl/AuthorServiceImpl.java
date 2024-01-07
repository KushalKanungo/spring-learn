package com.learn.spring.services.impl;

import com.learn.spring.controllers.AuthorController;
import com.learn.spring.dto.AuthorDto;
import com.learn.spring.entities.Author;
import com.learn.spring.repositories.AuthorRepository;
import com.learn.spring.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(AuthorDto author) {
        Author newAuthor = authorRepository.save(author.toEntity());
        return newAuthor.toDto();
    }
}
