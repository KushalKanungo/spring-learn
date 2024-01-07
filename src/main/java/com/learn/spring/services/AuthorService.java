package com.learn.spring.services;

import com.learn.spring.controllers.AuthorController;
import com.learn.spring.dto.AuthorDto;

public interface AuthorService {

    AuthorDto createAuthor(AuthorDto author);
}
