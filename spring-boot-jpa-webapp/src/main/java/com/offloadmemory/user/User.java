package com.offloadmemory.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_t")
public class User {
	
	@Id
	@Column(name = "user_id", unique = true, nullable = false, length = 50)
	int userId;
	@Column(name = "first_name", unique = true, nullable = false, length = 50)
	String firstName;
	@Column(name = "last_name", unique = true, nullable = false, length = 50)
	String lastName;
	
	public User(){
		super();
	}
	
	public User(int userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
