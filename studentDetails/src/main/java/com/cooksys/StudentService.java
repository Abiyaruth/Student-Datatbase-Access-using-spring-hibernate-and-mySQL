package com.cooksys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.model.StudentModel;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public List<StudentModel> readUsers() {
		return repository.readUsers();
	}

	public StudentModel readUser(Integer id) {
		return repository.readUser(id);
	}

	public StudentModel createUser(StudentModel studentmodel) {
		return repository.createUser(studentmodel);
	}

	public StudentModel updateUser(Integer id, StudentModel studentmodel) {
		return repository.updateUser(id, studentmodel);
	}

	public StudentModel deleteUser(Integer id) {
		return repository.deleteUser(id);
	}

	public StudentModel UserbyCity(Integer id,String City) {
		return repository.UserbyCity(id, City);
	}
}
