package com.dalgim.example.sb.security.basicauth.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Mateusz Dalgiewicz on 24.04.2017.
 */
@RequiredArgsConstructor
@Getter
public class Book {

    private final Long id;
    private final String name;

}
