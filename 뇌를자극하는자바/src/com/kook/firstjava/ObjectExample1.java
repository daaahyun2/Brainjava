package com.kook.firstjava;

public class ObjectExample1 {
	public static void main(String args[]) {
		StringBuffer obj;
		//StringBuffer obj = new StringBuffer("Hey,java"); 랑 밑줄이랑 같은겅미
		obj=new StringBuffer("Hey, Java"); //매개변수가 있는 생성자 호출
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1,'i');
		
		System.out.println(obj);
		
		int length = obj.length();
		System.out.println("문자열"+obj+"의 길이는"+length);
		
		obj.replace(1, 2, "ello");
		System.out.println(obj);
		//replace메소드를 사용하여,  Hi, Java -> Hello, Java 로 치환
	}
}
