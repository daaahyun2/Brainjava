package com.kook.firstjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


class JDBC_Insert {
    public static void main(String args[]) {
    	//1단계:DB연결을 위한 커넥션 인터페이스
        Connection conn = null;
        Statement stmt = null;
        
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
            
            //DB SQL작업
            stmt = conn.createStatement();
            String sql = "update person set age = 20";
            int chageRecord = stmt.executeUpdate(sql);
            /*int chageRecord = stmt.executeUpdate("UPDATE person\r\n"+
            					"SET age=30\r\n"+
            					"WHERE jumincd = '1110987654321'");
            */
            
            //4단계:DB연결을 종료한다.
            conn.close();
            System.out.println(chageRecord+"해당 건이 변경되었습니다.");
            
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}