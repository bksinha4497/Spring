package com.tm.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tm.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbctemplate;

	class PersonRowmapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			return person;
		}

	}

	public List<Person> findAll() {
		return jdbctemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}

	// Above using custom RowMapper
	public List<Person> findAllUsingCustomMapper() {
		return jdbctemplate.query("select * from person", new PersonRowmapper());
	}

	public Person findById(int id) {
		return jdbctemplate.queryForObject("select * from person where id =? ", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbctemplate.update("delete from person where id =? ", new Object[] { id });
	}

	public int insertperson(Person person) {
		return jdbctemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(?,?,?,?) ",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getBirthDate().getTime()) });
	}

	public int updatePerson(Person person) {
		return jdbctemplate.update("update person set name = ? ,location = ? ,birth_date = ? where id = ? ",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
						person.getId() });
	}

}
