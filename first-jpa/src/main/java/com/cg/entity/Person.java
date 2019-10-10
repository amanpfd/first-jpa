package com.cg.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="persons")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	@Transient
	private String nickName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
}
