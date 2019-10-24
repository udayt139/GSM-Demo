package database

import java.sql.DriverManager
import java.sql.ResultSet

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.common.Result
import com.mysql.jdbc.Connection
import com.mysql.jdbc.Statement

public class mysql {

	private static Connection connection=null;

	@Keyword
	//def connectDB(String url, String port, String dbname, String username, String password)
	def connectDB(String url, String user, String password, String driverClassName, String dbname)
	{
		String conn="jdbc:mysql://" + url +":3306" + "/" + dbname

		if(connection !=null && !connection.isClosed())
		{
			connection.close()
		}
		connection = DriverManager.getConnection(conn, user, password)
		return connection

	}

	@Keyword
	def executeQuery(String queryString)
	{
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		return rs
	}

	@Keyword
	def closeDatabaseConnection()
	{
		if(connection !=null && !connection.isClosed())
		{
			connection.close()
		}
		connection=null
	}

	@Keyword
	def execute(String queryString)
	{
		Statement stm = connection.createStatement()
		Result result = stm.execute(queryString)
		return result
	}
}
