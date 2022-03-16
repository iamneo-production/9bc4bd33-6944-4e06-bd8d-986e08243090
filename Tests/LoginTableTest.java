package com.examly.springapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.beans.Transient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginTableTest {
    
static Connection con=null;
private static Statement stmt;
public static String DB_URL = "jdbc:mysql://localhost:3306/test"; 
public static String DB_USER = "root";
public static String DB_PASSWORD = "examly";

@BeforeTest
public void setUp() throws Exception{
    try{
        String dbClass = "com.mysql.jdbc.Driver";
Class.forName(dbClass).newInstance();
Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
stmt=con.createStatement();
    }catch(Exception e){
e.printStackTrace();
    }

}

@Test
public void test(){
    try{
String query ="select * from login_model";

ResultSet res = stmt.executeQuery(query);
while(res.next()){
    System.out.println(res.getString(1)+" "+res.getString(2));

}
    }catch(Exception e){
e.printStackTrace();
    }
}

@AfterTest
public void tearDown() throws Exception{
    if(con !=null){
        con.close();
    }
}
}