package ����2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CREATE_DB{
    public static void main(String[] args) {
     String driver ="com.mysql.cj.jdbc.Driver"; //mysq1
    String url = "jdbc:mysql://localhost:3306/app?";
    Connection conn = null;
    Statement stmt = null;
    try {
       Class.forName(driver);
       System.out.println("�ε� ����");
       conn = DriverManager.getConnection(url, "root", "java");
       System.out.println("���� ����");
       String sql = "CREATE TABLE BOOKDTO("
               + "         ibsn INT primary key,"
               + "         title varchar(50) not null,"
               + "         author varchar(250) not null,"
               + "         publisher varchar(50) not null,"
               + "         price INT not null,"
               + "         desc2 varchar(200),"
               + "         publish_date varchar(10)"
               + ")";
       stmt = conn.createStatement();
       stmt.executeUpdate(sql);
    }catch(Exception e) {
         e.printStackTrace();
    }
}}