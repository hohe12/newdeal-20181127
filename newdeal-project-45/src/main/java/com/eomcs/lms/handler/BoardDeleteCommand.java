package com.eomcs.lms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.mariadb.jdbc.Driver;

import com.eomcs.lms.domain.Board;

public class BoardDeleteCommand implements Command {
  
  Scanner keyboard;
  
  public BoardDeleteCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    Connection con = null;
	Statement stmt = null;

	    try {	      // mariadb jdbc 드라이버 구현체를 로딩
		      DriverManager.registerDriver(new Driver());

		      //DBMS에 연결하기
		      con = DriverManager.getConnection(
		          "jdbc:mariadb://localhost:3306/studydb",
		          "study", "1111");
		      stmt = con.createStatement();


	      stmt.executeUpdate("delete from board where bno=" + no);

	      System.out.println("삭제했습니다!");

	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      try {stmt.close();} catch (Exception e) {}
	      try {con.close();} catch (Exception e) {}

	    }
	  }
	}
