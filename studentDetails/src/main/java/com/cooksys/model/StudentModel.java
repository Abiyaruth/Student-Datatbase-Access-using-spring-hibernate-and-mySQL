package com.cooksys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "StudentDetails")
public class StudentModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		@Column(name = "NAME")
		public String name;
		@Column(name = "USERNAME")
		public String userName;
		@Column(name = "password")
		public String password;
		@Column(name = "CITY")
		public String city;
		@Column(name = "STATE")
		public String state;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
	
}
