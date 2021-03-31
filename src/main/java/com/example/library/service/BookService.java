package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, Category category, Integer availableCopies, Author author);

    Optional<Book> edit(Long id, String name, Category category, Integer availableCopies, Author author);

    void deleteById(Long id);
}
