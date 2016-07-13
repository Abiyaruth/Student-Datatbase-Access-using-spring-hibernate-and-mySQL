package com.cooksys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cooksys.model.StudentModel;

@RestController
@CrossOrigin(methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.PUT })
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	List<StudentModel> getUsers() {
		return service.readUsers();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	StudentModel getUser(@PathVariable Integer id) {
		return service.readUser(id);
	}
	@RequestMapping(value="/user/{City}",method = RequestMethod.GET) 
	StudentModel UserbyCity(Integer id,String City) {
		return service.UserbyCity(id, City);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	StudentModel postUser(@RequestBody StudentModel studentmodel) {
		return service.createUser(studentmodel);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	StudentModel putUser(@PathVariable Integer id, @RequestBody StudentModel studentmodel) {
		return service.updateUser(id, studentmodel);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	StudentModel deleteUser(@PathVariable Integer id) {
		return service.deleteUser(id);
	}
	
}
