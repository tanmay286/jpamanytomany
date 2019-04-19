package com.capgemini.spring.jpa.manytomany.service;

import com.capgemini.spring.jpa.manytomany.entity.Person;
import com.capgemini.spring.jpa.manytomany.entity.Project;

public interface PersonService {
	
	//public void add();
	//public Person findById();
	public void addProject(Project project);
	public void addPerson(Person person);
	public Person findById(int id);

}
