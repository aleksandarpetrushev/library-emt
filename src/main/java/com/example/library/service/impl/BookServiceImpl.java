package com.example.library.service.impl;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.enumerations.Category;
import com.example.library.repository.BookRepository;
import com.example.library.service.BookService;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepository.loadAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> save(String name, Category category, Integer availableCopies, Author author) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Long id, String name, Category category, Integer availableCopies, Author author) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
