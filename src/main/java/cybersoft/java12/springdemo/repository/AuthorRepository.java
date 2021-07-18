package cybersoft.java12.springdemo.repository;

import cybersoft.java12.springdemo.container.IoCContainer;
import cybersoft.java12.springdemo.dbconnection.DatabaseConnection;

public class AuthorRepository {
	private DatabaseConnection dbConnection;
	
	public AuthorRepository() {
		dbConnection = (DatabaseConnection) IoCContainer.getBean("mySqlConnection");
	}
	
	public void getAuthors() {
		dbConnection.getConnection();
	}
}
