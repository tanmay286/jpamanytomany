package com.capgemini.spring.jpa.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.jpa.manytomany.entity.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
