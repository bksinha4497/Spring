package com.tm.springboot.springbootin10steps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	long id;
	String name;
	String author;

}
