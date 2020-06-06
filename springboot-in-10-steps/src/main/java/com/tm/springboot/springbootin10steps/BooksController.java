package com.tm.springboot.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/book")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "Bk One", "Biswajit"));
	}

}