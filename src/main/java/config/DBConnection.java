package config;

import java.sql.*;
import java.util.List;

public class DBConnection {
    Connection conn = null;                 // 데이터 베이스와 연결을 위한 객체
    Statement stmt = null;                 // SQL 문을 데이터베이스에 보내기위한 객체
    ResultSet rs = null;                   // SQL 질의에 의해 생성된 테이블을 저장하는 객체

    PreparedStatement pstmt=null;

    // 1. JDBC Driver Class - com.mysql.jdbc.Driver
    private String driver = "com.mysql.jdbc.Driver";

    // 2. 데이터베이스에 연결하기 위한 정보
    private String url = "jdbc:mysql://localhost:3306/oop?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true";       // 연결문자열
    private String user = "root";                                     // 데이터베이스 ID
    private String pw = "1234";                                       // 데이터베이스 PW

    public DBConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pw);
            System.out.println("DB Connection SUCCESS");

        } catch (SQLException ex) {
            System.out.println("SQLException" + ex);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet selectQuery(String query) throws SQLException {
        stmt=conn.createStatement();
        rs=stmt.executeQuery(query);

        return rs;
    }
    public ResultSet selectQueryWithCondition(String query, List<Integer> params) throws SQLException {
        pstmt=conn.prepareStatement(query);
        int index=1;
        for(Integer par:params){
            pstmt.setString(index,par.toString());
        }
        rs=pstmt.executeQuery();

        return rs;
    }
//    public String insertQuery(String query){
//
//    }
}
