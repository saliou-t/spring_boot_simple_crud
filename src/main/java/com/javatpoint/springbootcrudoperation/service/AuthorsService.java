package com.javatpoint.springbootcrudoperation.service;

import com.javatpoint.springbootcrudoperation.model.Authors;
import com.javatpoint.springbootcrudoperation.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorsService {

    @Autowired
    AuthorsRepository authorsRepository;

    public List<Authors> getAuthors() {

        List<Authors> authors = new ArrayList<Authors>();
        authorsRepository.findAll().forEach(authors1 -> authors.add(authors1));

        return authors;
    }

    public Authors getAuthorsById(int id)
    {
        return authorsRepository.findById(id).get();
    }

    public void saveOrUpdate(Authors authors)
    {
        authorsRepository.save(authors);
    }

    public void delete(int authorid) {

        authorsRepository.deleteById(authorid);
    }

    public void update(Authors authors)
    {
        authorsRepository.save(authors);
    }
}
