package com.learn.spring.services.impl;

import com.learn.spring.controllers.AuthorController;
import com.learn.spring.dto.AuthorDto;
import com.learn.spring.entities.Author;
import com.learn.spring.repositories.AuthorRepository;
import com.learn.spring.services.AuthorService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(@NotNull AuthorDto author) {
        Author newAuthor = authorRepository.save(author.toEntity());
        return newAuthor.toDto();
    }

    @Override
    public List<AuthorDto> listOfAuthors() {
        List<Author> authorsEntity = authorRepository.findAll();
        return  authorsEntity.stream().map(Author::toDto).collect(Collectors.toList());
    }
}
