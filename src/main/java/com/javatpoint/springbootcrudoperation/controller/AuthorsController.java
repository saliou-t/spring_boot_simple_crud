package com.javatpoint.springbootcrudoperation.controller;

import com.javatpoint.springbootcrudoperation.model.Authors;
import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorsController {

    @Autowired
    AuthorsService authorsService;

    @GetMapping(path = "authors")
    private List<Authors> getAllAuthors(){
        return authorsService.getAuthors();
    }

    @GetMapping("/authors/{authorid}")
    private Authors getAuthords(@PathVariable("authorid") int authorid)
    {
        return authorsService.getAuthorsById(authorid);
    }

    @PostMapping("/author")
    private int saveAuthor(@RequestBody Authors authors)
    {
         authorsService.saveOrUpdate(authors);
        return authors.getAuthorId();
    }
}
