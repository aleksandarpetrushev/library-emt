package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();
}
