package com.tm.database.databasedemo.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String location, Timestamp birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.location = location;
	}

	public Person(String name, String location, Timestamp birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.location = location;
	}

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private Timestamp birthDate;
	private String location;

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", location=" + location + "]";
	}

}
