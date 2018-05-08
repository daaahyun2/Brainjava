package com.kook.firstjava;

import java.sql.*;

class Person{
	
	String jumincd = null;
	String person_name=null;
	String gender=null;
    int age = 0;
    
    public Person() {
    	this.jumincd = "주민번호 입력 누락";
    	this.person_name="이름 입력 누락";
    	this.gender="성별 입력 누락";
    	this.age=0;
    }
    
	public String getJumincd() {
		return jumincd;
	}
	public void setJumincd(String jumincd) {
		this.jumincd = jumincd;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
    
}

class JDBC_Person{
		    public static void main(String args[]) {
		    	
		    	Person[] persons = new Person[3]; //배열객체
		    	System.out.println(persons);
		    	
		    	for(int i=0; i<persons.length; i++) {
			    	persons[i]=new Person(); //persons.length만큼 생성자 호출 배열레퍼런스 대입
			    	}
		    	
		    	/*for(int i=0; i<persons.length; i++) {
		    	System.out.println("주민번호 	: "+persons[i].getJumincd());
		    	System.out.println("이름 		: "+persons[i].getPerson_name());
		    	System.out.println("성별 		: "+persons[i].getGender());
		    	System.out.println("나이 		: "+persons[i].getAge());
		    	}*/
		    
		    
//		    	Person person; 				//레퍼런스 변수선언
//		    	person = new Person(); 		//객체생성 - new연산자이용
//		    	// 한줄로 표현하면 > Person person = new Person();
//		    	
//		    	//person객체에 멤버필드를 셋팅 
//		    	person.setJumincd("960125-2xxxxxx");
//		    	person.setPerson_name("김다현");
//		    	person.setGender("F");
//		    	person.setAge(23);
		    	
		    	
	/*출력방법1	/*int age = person.getAge();
		    	System.out.println(age);*/
		    	
	/*출력방법2   	/*System.out.println(person.age);*/
		    	
	/*출력방법3	/*System.out.println("주민번호 : "+person.jumincd);
		    	System.out.println("이름 : "+person.person_name);
		    	System.out.println("성별 : " +person.gender);
		    	System.out.println("나이 : "+person.age);*/
		    	
		    	
		    	
//------------------------------------JDBC연결문 시작-------------------------------------//
	    	//1단계:DB연결을 위한 커넥션 인터페이스
	        Connection conn = null;
	        //Statment 인터페이스 			- SQL 실행
	        Statement stmt = null; //statmet=stmt (줄인거)
	        //ResultSet 인터페이스 			- SQL결과를 저장
	        ResultSet rs = null;
	        //try~catch문에서 DB연결중에 예외가 발생하는지를 검사.
	        try {
	        	String jumincd = null;
	            String person_name=null;
	            String gender=null;
	            int age = 0;
	        	//2단계:JDBC드라이버를 로드한다.
	            Class.forName("com.mysql.jdbc.Driver");
	            //3단계:드라이버매니저 클래스는 DB를 연결한다.
	            conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/mysql", 	//경로
	               								"root", 	//계정
	               								"12345"); 	//패스워드
	            System.out.println("데이터베이스에 접속했습니다.\n");
	            
	            //커넥션객체가 Statment객체를 생성 
	            stmt = conn.createStatement();
	            
	            //DML SQL쿼리 실행 후 결과를 저장
	            rs = stmt.executeQuery("select jumincd,	person_name,	gender,	age from person");
	            
	            System.out.println("개인정보");
	        int i = 0;
	        while(rs.next()) {
	            
	        	persons[i].setJumincd(rs.getString(1));
	        	persons[i].setPerson_name(rs.getString(2));
	        	persons[i].setGender(rs.getString(3));
	        	persons[i].setAge(rs.getInt(4));
	        	i++;
	        	
/*			   jumincd = rs.getString(1); //rs.getString("jumincd");
	           person_name = rs.getString(2); //rs.getString("person_name");
	           gender = rs.getString(3); //rs.getString("gender");
	           age = rs.getInt(4); //rs.getInt("age");
*/	            
	            //System.out.println(jumincd+"---"+person_name+"-----"+gender+"------"+age);
	        }
	            //4단계:DB연결을 종료한다.
	            conn.close();
	            System.out.println("=========================================");
	            
	            //System.out.println(jumincd+"---"+person_name+"-----"+gender+"------"+age);
	            
	            for(i=0; i<persons.length; i++) {
			    	System.out.println("주민번호	: "+persons[i].getJumincd());
			    	System.out.println("이름 		: "+persons[i].getPerson_name());
			    	System.out.println("성별 		: "+persons[i].getGender());
			    	System.out.println("나이 		: "+persons[i].getAge());
			    	System.out.println("=========================================");
			    	}
	        }
	        catch (ClassNotFoundException cnfe) {
	            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	        }
	        catch (SQLException se) {
	            System.out.println(se.getMessage());
	        }
//------------------------------------JDBC연결문 종료-------------------------------------//
		    }
}