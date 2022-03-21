package com.lt.crs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lt.crs.model.Professor;
import com.lt.crs.repo.ProfessorRepo;

@Repository
public class ProfessorDAOImpl implements 
ProfessorDAOInterface
{

	@Autowired
	ProfessorRepo professorRepo;
	
	
	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("in prof DAO");
		professorRepo.save(new Professor("a","a"));
	}

}
