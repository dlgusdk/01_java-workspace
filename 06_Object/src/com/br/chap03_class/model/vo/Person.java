package com.br.chap03_class.model.vo;

public class Person {
	//필드(==멤버변수)
	private String id;  
	private String pwd;		
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//setter메소드(각 필드에 값을 대입(초기화, 수정시키기 위한 용도))
	public void setId(String id) {
		this.id = id; 
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter메소드 7개 
	
	public String getId() {
		return id; //return할 수 있는 값은 딱 한개.
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String information() {	//하나하나 하지않아도 하나로 합쳐서 가능. 그렇다해서 getter메소드를 빼서는 않된다.-> 필드값 하나만 알고자 할 때 필요
		return id + ", " + pwd + ", "
			+ name + ", " + age + ", "
			+ gender + ", " + phone + ", "
			+ email;
	}

}
