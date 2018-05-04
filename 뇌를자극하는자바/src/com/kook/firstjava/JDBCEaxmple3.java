package com.kook.firstjava;

import java.sql.*;

class JDBCEaxmple3{
		    public static void main(String args[]) {
	    	//1단계:DB연결을 위한 커넥션 인터페이스
	        Connection conn = null;
	        //Statment 인터페이스 			- SQL 실행
	        Statement stmt = null; //statmet = stmt (줄인거)
	        //ResultSet 인터페이스 			- SQL결과를 저장
	        ResultSet rs = null;
	        //try~catch문에서 DB연결중에 예외가 발생하는지를 검사.
	        try {
	        	//2단계:JDBC드라이버를 로드한다.
	            Class.forName("com.mysql.jdbc.Driver");
	            //3단계:드라이버매니저 클래스는 DB를 연결한다.
	            conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/mysql", 	//경로
	               								"root", 	//계정
	               								"12345"); 	//패스워드
	            System.out.println("데이터베이스에 접속했습니다.");
	            
	            //커넥션객체가 Statment객체를 생성 
	            stmt = conn.createStatement();
	            
	            //DML SQL쿼리 실행 후 결과를 저장
	            rs = stmt.executeQuery("select goodsinfo_code,	goodsinfo_name,	price,	maker from goodsinfo");
	            
	            System.out.println("상품코드	상품명	가격	제조사");
	            
	        while(rs.next()) {
	            
	            int goodsinfo_code = rs.getInt(1); //rs.getString("jumincd");
	            String goodsinfo_name = rs.getString(2); //rs.getString("person_name");
	            int price = rs.getInt(3); //rs.getString("gender");
	            String maker = rs.getString(4); //rs.getInt("age");
	            
	            System.out.println(goodsinfo_code+"---"+goodsinfo_name+"-----"+price+"------"+maker);
	        }
	            //4단계:DB연결을 종료한다.
	            conn.close();
	        }
	        catch (ClassNotFoundException cnfe) {
	            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
	        }
	        catch (SQLException se) {
	            System.out.println(se.getMessage());
	        }
		    }
}