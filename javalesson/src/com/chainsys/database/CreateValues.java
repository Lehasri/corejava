package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateValues {

	public static void main(String[] args) {
		try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle" );
            Statement mystat = myCon.createStatement();
            String Query=("create table emp6(name varchar2(30),salary int)");
           //ResultSet myRs=mystat.executeQuery("select * from emp4");
           mystat.execute(Query);
           //while (myRs.next()) {
             //  System.out.println(myRs.getString(1)+" "+myRs.getDate(2));
           //}
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
		

	}

}
