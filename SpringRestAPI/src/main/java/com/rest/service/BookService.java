package com.rest.service;

import com.rest.domain.Book;

public interface BookService {
    public Book getBook(long id);

    public long addBook(Book book);

    public long getBookCount();
}
