package com.afonsoAlves33.project;

import java.util.concurrent.atomic.AtomicLong;

import com.afonsoAlves33.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.afonsoAlves33.exceptions.UnsupportedMathOperationException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/person")
@RestController
public class PersonController {
    // This annotation will make spring automatically instance our class in runtime execution
    @Autowired
    private PersonServices service;

    @RequestMapping(value="/{id}")
}

