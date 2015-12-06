package com.asd.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	public String test2(String input) {
		return input + "!!";
	}

}
