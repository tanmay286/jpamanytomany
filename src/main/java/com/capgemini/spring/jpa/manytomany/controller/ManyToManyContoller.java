package com.capgemini.spring.jpa.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.jpa.manytomany.entity.Person;
import com.capgemini.spring.jpa.manytomany.entity.Project;
import com.capgemini.spring.jpa.manytomany.service.PersonService;

@RestController
public class ManyToManyContoller {

	@Autowired
	PersonService service;

	@RequestMapping("/")
	public void add() {
		Person p1 = new Person(1001, "kapil");
		Person p2 = new Person(1002, "ruchir");
		Person p3 = new Person(1003, "tanmay");

		Project pr1 = new Project(101, "bankApp");
		Project pr2 = new Project(102, "app");
		Project pr3 = new Project(103, "java");

		Set<Person> personP1 = new HashSet<Person>();
		Set<Person> personP2 = new HashSet<Person>();
		Set<Person> personP3 = new HashSet<Person>();

		Set<Project> projectPer1 = new HashSet<Project>();
		Set<Project> projectPer2 = new HashSet<Project>();
		Set<Project> projectPer3 = new HashSet<Project>();

		personP1.add(p1);
		personP1.add(p2);
		personP2.add(p3);
		personP3.add(p1);

		projectPer1.add(pr1);
		projectPer1.add(pr3);
		projectPer2.add(pr1);
		projectPer3.add(pr2);

		p1.setProject(projectPer1);
		p2.setProject(projectPer2);
		p3.setProject(projectPer3);

		pr1.setPerson(personP1);
		pr2.setPerson(personP2);
		pr3.setPerson(personP3);

		service.addPerson(p1);
		service.addPerson(p2);
		service.addPerson(p3);
		service.addProject(pr1);
		service.addProject(pr2);
		service.addProject(pr3);

	}

	@RequestMapping("/new")
	public Set<Person> get() {
		Set<Person> person = new HashSet<>();
		for(int i=1001; i<1004;i++)
		{
			person.add(service.findById(i));
		}
		return person;
	}

}
