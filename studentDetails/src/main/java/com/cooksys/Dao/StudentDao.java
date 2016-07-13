package com.cooksys.Dao;

import java.util.List;

import com.cooksys.model.StudentModel;

public interface StudentDao {
	public StudentModel createUser(StudentModel usermodel);
	public StudentModel updateUser(Integer id, StudentModel usermodel) ;
	public StudentModel deleteUser(Integer id);
	public StudentModel readUser(Integer id);
	public List<StudentModel> readUsers() ;
	public StudentModel UserbyCity(Integer id,String City);
}
