package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection() throws Exception {
		
		String drive = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_apiClientesI";
		String user = "postgres";
		String password = "coti";
		
		Class.forName(drive);
		return DriverManager.getConnection(url, user, password);
		
	}

}
