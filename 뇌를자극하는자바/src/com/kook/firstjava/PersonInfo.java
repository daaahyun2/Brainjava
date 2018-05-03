package com.kook.firstjava;

public class PersonInfo {

	public static void main(String[] args) {
		
		//생성자 호출하여 객체생성
		Person person;
		//person = new Person();
		
		//String 매개변수 1개있는 생성자 호출하여 객체생성
		person = new Person("홍길동");
		
		//String 매개변수 int 매개변수 있는 생성자 호출하여 객체생성
		person = new Person("홍길동",20);		
		person.showPerson();
	}

}
