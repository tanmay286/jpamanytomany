package com.capgemini.spring.jpa.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.jpa.manytomany.dao.PersonDao;
import com.capgemini.spring.jpa.manytomany.dao.ProjectDao;
import com.capgemini.spring.jpa.manytomany.entity.Person;
import com.capgemini.spring.jpa.manytomany.entity.Project;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	@Autowired
	ProjectDao pdao;
	
	
	@Override
	public Person findById(int id) {
		
		Person person=dao.findById(id).get();
		return person;
	}

	@Override
	public void addProject(Project project) {
		pdao.save(project);
		
		
	}

	@Override
	public void addPerson(Person person) {
		dao.save(person);
		
	}
	
	

}
