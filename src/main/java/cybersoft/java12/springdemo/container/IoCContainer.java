package cybersoft.java12.springdemo.container;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;

import cybersoft.java12.springdemo.dbconnection.DbDataSource;
import cybersoft.java12.springdemo.dbconnection.MySQLConnection;
import cybersoft.java12.springdemo.dbconnection.PgConnection;
import cybersoft.java12.springdemo.repository.AuthorRepository;

public class IoCContainer {
	private static MySQLConnection mySqlConnection = null;
	private static PgConnection pgConnection = null;
	private static DbDataSource dataSource = null;
	private static AuthorRepository authorRepository = null;
	
	public static Object getBean(String beanName) {
		switch (beanName) {
			case "mySqlConnection":
				return getMySqlConnection();
				
			case "pgConnection":
				return getPgConnection();
				
			case "dataSource":
				return getDataSource();
	
			case "authorRepository":
				return getAuthorRepository();
				
			default:
				break;
		}
		
		return null;
	}

	private static Object getAuthorRepository() {
		return authorRepository == null ? new AuthConfigFactoryImpl() : authorRepository;
	}

	private static Object getDataSource() {
		return dataSource == null ? new DbDataSource("", "", "") : dataSource;
	}

	private static Object getPgConnection() {
		return pgConnection == null
				? new PgConnection((DbDataSource) getDataSource()) : pgConnection;
	}

	private static Object getMySqlConnection() {
		return mySqlConnection == null
				? new MySQLConnection((DbDataSource) getDataSource()) : mySqlConnection;
	}
	
	
}
