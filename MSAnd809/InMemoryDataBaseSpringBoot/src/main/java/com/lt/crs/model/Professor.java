package com.lt.crs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer professorId;
	private String professorName;
	private String professorDepartment;


	
	public Professor(String professorName, String professorDepartment) {
	//	super();
		this.professorName = professorName;
		this.professorDepartment = professorDepartment;
	}

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	

	public String getProfessorDepartment() {
		return professorDepartment;
	}

	public void setProfessorDepartment(String professorDepartment) {
		this.professorDepartment = professorDepartment;
	}

	
}
