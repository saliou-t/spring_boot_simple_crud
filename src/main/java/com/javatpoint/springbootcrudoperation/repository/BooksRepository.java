package com.javatpoint.springbootcrudoperation.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.springbootcrudoperation.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}