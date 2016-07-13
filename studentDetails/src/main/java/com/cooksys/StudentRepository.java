package com.cooksys;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.Dao.StudentDao;
import com.cooksys.model.StudentModel;
@Repository
public class StudentRepository {
	@Autowired
	EntityManager em;
	
	@Autowired
	StudentDao studentdao;

	public StudentModel readUser(Integer id){
		return studentdao.readUser(id);
	}
	
	public List<StudentModel> readUsers() {
		return studentdao.readUsers();
	}

	public StudentModel createUser(StudentModel studentmodel) {
		return studentdao.createUser(studentmodel);
	}

	public StudentModel updateUser(Integer id, StudentModel studentmodel) {
		return studentdao.updateUser(id, studentmodel);
	}

	public StudentModel deleteUser(Integer id) {
		return studentdao.deleteUser(id);
	}
	public StudentModel UserbyCity(Integer id,String City) {
		return studentdao.UserbyCity(id, City);
	}
}
