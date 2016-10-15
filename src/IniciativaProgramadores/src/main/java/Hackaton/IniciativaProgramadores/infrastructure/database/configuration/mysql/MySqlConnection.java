package Hackaton.IniciativaProgramadores.infrastructure.database.configuration.mysql;

import java.sql.*;

import Hackaton.IniciativaProgramadores.infrastructure.database.configuration.DataBaseConnection;
import Hackaton.IniciativaProgramadores.infrastructure.database.configuration.DataBaseConstants;

public class MySqlConnection implements DataBaseConnection {

	private Connection _connection;
	
	public MySqlConnection() {
		
	}

	@Override
	public void open() throws ClassNotFoundException, SQLException {
		Class.forName(DataBaseConstants.DRIVER);
		_connection = DriverManager.getConnection(DataBaseConstants.URL, DataBaseConstants.USER, DataBaseConstants.PASSWORD);
	}
	
	@Override
	public Connection getConnection() {
		return this._connection;
	}

	@Override
	public void close() throws SQLException {
		if (_connection != null && !_connection.isClosed()) {
			_connection.close();
			_connection = null;
		}
	}
}