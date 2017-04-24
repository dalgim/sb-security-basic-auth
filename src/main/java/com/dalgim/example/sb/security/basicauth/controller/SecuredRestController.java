package com.dalgim.example.sb.security.basicauth.controller;

import com.dalgim.example.sb.security.basicauth.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Dalgiewicz on 24.04.2017.
 */
@RestController
@RequestMapping("/api/book")
public class SecuredRestController {

    private static List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book(1L, "Harry Potter"));
        bookList.add(new Book(2L, "The Lord of the Rings"));
    }

    @RequestMapping("/")
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

}
