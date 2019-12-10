package com.mindtree.departmentRegistration.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import org.springframework.stereotype.Component;

import com.mindtree.departmentRegistration.exceptions.UtilityException;

@Component
public class Dbconnection {

	private static final String URL = "jdbc:mysql://localhost:3306/nv";
	private static final String USER = "root";
	private static final String PASS = "Welcome123";

	public static Connection getConnection() throws UtilityException {
		Connection con = null;
		try {

			con = DriverManager.getConnection(URL, USER, PASS);

		} catch (SQLException e) {
			throw new UtilityException(e);
		}
		return con;

	}

	public static String closeConnection(Connection con) throws UtilityException {
		String res = "";
		try {
			con.close();
			res = "Successfully closed the connection";
		} catch (SQLException e) {
			throw new UtilityException(e);
		}

		return res;
	}

}
