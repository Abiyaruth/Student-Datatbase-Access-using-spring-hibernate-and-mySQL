package com.cooksys.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cooksys.model.StudentModel;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
	@Autowired
	EntityManager em;
	@Override
	public StudentModel createUser(StudentModel studentmodel) {
		em.persist(studentmodel);
		return studentmodel;
	}

	@Override
	public StudentModel updateUser(Integer id, StudentModel studentmodel) {
		StudentModel stu = em.find(StudentModel.class, id);
		String city = studentmodel.getCity() ;
		if(city != null) {
			stu.setCity(city);			
		}
		String name = studentmodel.getName();
		if(name != null) {
			stu.setName(name);			
		}
		String state = studentmodel.getState() ;
		if(state != null) {
			stu.setState(state);			
		}

		em.persist(stu);
		return stu;
	}
	

	@Override
	public StudentModel deleteUser(Integer id) {
		StudentModel stu = em.createQuery("from StudentModel where id = :id", StudentModel.class)
				.setParameter("id",id)
				.getSingleResult();
		em.remove(stu);

		return stu;
	}

	@Override
	public StudentModel readUser(Integer id) {
		return em.find(StudentModel.class, id);
	}

	@Override
	public List<StudentModel> readUsers() {
		return em.createQuery("from StudentModel", StudentModel.class).getResultList();
	}

	@Override
	public StudentModel UserbyCity(Integer id,String City) {
		return em.find(StudentModel.class, City);
	}

}
