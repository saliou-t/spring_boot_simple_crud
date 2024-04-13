package com.javatpoint.springbootcrudoperation.repository;

import com.javatpoint.springbootcrudoperation.model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Authors,Integer> {
}
