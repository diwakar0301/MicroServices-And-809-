package com.lt.crs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorServiceInterface{
	@Autowired
	com.lt.crs.dao.ProfessorDAOInterface profDAO;

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("in prof service");
		profDAO.check();
		
	}

}
