package cybersoft.java12.springdemo.dbconnection;

public class MySQLConnection implements DatabaseConnection {
	private DbDataSource dataSource;

	public MySQLConnection(DbDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void getConnection() {
		System.out.println("Got MySql Connection");
	}

}
