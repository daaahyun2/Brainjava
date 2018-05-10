package com.malldb;

import java.sql.*;

class JDBCExample1 {
    public static void main(String args[]) {
    	//1단계:DB연결을 위한 커넥션 인터페이스
        Connection conn = null;
        //Statment 인터페이스 			- SQL 실행
        Statement stmt = null; //statmet=stmt (줄인거)
        //ResultSet 인터페이스 			- SQL결과를 저장
        ResultSet rs = null;
        //try~catch문에서 DB연결중에 예외가 발생하는지를 검사.
        try {
        	//2단계:JDBC드라이버를 로드한다.
            Class.forName("com.mysql.jdbc.Driver");
            //3단계:드라이버매니저 클래스는 DB를 연결한다.
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/malldb", 	//경로
               								"root", 	//계정
               								"12345"); 	//패스워드
            System.out.println("데이터베이스에 접속했습니다.");
            
            // (mysql) malldb접속 정보 -> SHOW PROCESSLIST;
            
            //커넥션객체가 Statment객체를 생성 
            stmt = conn.createStatement();
            
            //DML SQL쿼리 실행 후 결과를 저장
            rs = stmt.executeQuery("select now()");
            while(rs.next()) {; //레코드(데이터)가 있으면 rs을 레코드에 첫 줄로 이동한다.
            String now = rs.getString(1); 
            System.out.println(now);
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