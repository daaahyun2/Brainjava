package com.kook.firstjava;

import java.sql.*;
import java.util.ArrayList;

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

class JDBC_Person_ArrayList{
		    public static void main(String args[]) {
		    			    	
		    	ArrayList<Person> ListPerson = new ArrayList<Person>();
		    		
		    	
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
	        
	        while(rs.next()) {
	          
	        	Person person = new Person();
	        	
	        	person.setJumincd(rs.getString(1));			//rs.getString("jumincd");
	        	person.setPerson_name(rs.getString(2)); 	//rs.getString("person_name");
	        	person.setGender(rs.getString(3));			//rs.getString("gender");
	        	person.setAge(rs.getInt(4));				//rs.getInt("age");
	        	
	        	ListPerson.add(person);
	        
	            //4단계:DB연결을 종료한다.
	        }
	            conn.close();
	        
	            System.out.println("=========================================");
	            
	            for(int i=0; i<ListPerson.size(); i++) {
	            	System.out.print(ListPerson.get(i).getJumincd()+" ");
	            	System.out.print(ListPerson.get(i).getPerson_name()+" ");
	            	System.out.print(ListPerson.get(i).getGender()+" ");
	            	System.out.print(ListPerson.get(i).getAge()+" ");
	            	System.out.println();
	            	
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