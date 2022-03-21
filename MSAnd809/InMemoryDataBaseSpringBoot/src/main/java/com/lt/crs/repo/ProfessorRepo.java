package com.lt.crs.repo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lt.crs.model.Professor;


@Repository
public interface ProfessorRepo extends JpaRepository<Professor,Integer>{

}

//@Repository
//class Ape{
//	static {System.out.println("hello ape");}
//}