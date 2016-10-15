package Hackaton.IniciativaProgramadores.infrastructure.database.configuration;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataBaseConnection {
	
	void open() throws ClassNotFoundException, SQLException;

	Connection getConnection();
	
    void close() throws SQLException;
}
