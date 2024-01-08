package com.learn.spring.controllers;

import com.learn.spring.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/books")
public class BookController {

    @PutMapping("/{isbn}")
    public ResponseEntity<BookDto>

}
