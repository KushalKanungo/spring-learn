package com.learn.spring.services;

import com.learn.spring.controllers.AuthorController;
import com.learn.spring.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    AuthorDto createAuthor(AuthorDto author);

    List<AuthorDto> listOfAuthors();
}
