package com.asd.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asd.demo.dao.TestDao;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	public String test2(String input) {

		return testDao.test2(input);
	}

}