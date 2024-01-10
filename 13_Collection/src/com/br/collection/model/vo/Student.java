package com.br.collection.model.vo;

import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	//equals 메소드 => 현재 객체의 필드값들이랑 전달된 객체의 필드값들 모두 일치하면 true반환
	/*@Override
	public boolean equals(Object obj) {
		//Student객체.equals(Student객체)
		Student Other = (Student)obj;
		//this.name랑 other.name일치하는지 ~age, score도
		
		if(name.equals(Other.name) && age == Other.age && score == Other.score) {
			return true;
		}else {
			return false;
		}
	}
	
	//hashCode 메소드 => 필드값 가지고 10진수 숫자를 만들도록
	public int hashCode() {
		return (name + age + score).hashCode();
	}
	*/
}


