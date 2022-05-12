package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Second {
	public static void main(String[] args) {
        try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle" );
            Statement mystat = myCon.createStatement();
             mystat.executeQuery("update  family set Gender='Female' where Name='G.Deepu'");
           ResultSet myRs=mystat.executeQuery("select * from family");
           while (myRs.next()) {
               System.out.println(myRs.getString(1)+" "+myRs.getDate(2)+" "+myRs.getString(3)+" "+myRs.getString(4));
           }
           int count =mystat.getUpdateCount();
           System.out.println("Total records updated: "+count);
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

}
