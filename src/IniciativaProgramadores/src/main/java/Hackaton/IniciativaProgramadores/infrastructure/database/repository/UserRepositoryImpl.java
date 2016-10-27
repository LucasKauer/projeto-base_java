package Hackaton.IniciativaProgramadores.infrastructure.database.repository;

import Hackaton.IniciativaProgramadores.domain.user.User;
import Hackaton.IniciativaProgramadores.infrastructure.database.configuration.DataBaseConnection;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.DependencyInjectionException;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.Provider;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepositoryImpl implements UserRepository {

	private static final String INSERT_USER = "INSERT INTO User (Name) VALUES (?)";
	private static final String UPDATE_USER = "UPDATE User SET Name = ? WHERE Name = ?";
	private static final String DELETE_USER = "DELETE FROM User WHERE Name = ?";

	private DataBaseConnection _dataBaseConnection;
	
	public UserRepositoryImpl() throws DependencyInjectionException {
		_dataBaseConnection =  Provider.getInstance().get(DataBaseConnection.class);
	}
	
	@Override
	public void save(User user) throws ClassNotFoundException, SQLException {
		_dataBaseConnection.open();
		saveCommand(user);
		_dataBaseConnection.close();
	}

	@Override
	public void update(User newUser, User oldUser) throws ClassNotFoundException, SQLException {
		_dataBaseConnection.open();
		updateCommand(newUser, oldUser);
		_dataBaseConnection.close();
		
	}

	@Override
	public void delete(User user) throws ClassNotFoundException, SQLException {
		_dataBaseConnection.open();
		deleteCommand(user);
		_dataBaseConnection.close();
		
	}

	@Override
	public User findBy(int id) throws ClassNotFoundException, SQLException {
		_dataBaseConnection.open();
		User result = findByCommand(id);
		_dataBaseConnection.close();
		
		return result;
	}

	@Override
	public Iterable<User> findAll() throws ClassNotFoundException, SQLException {
		_dataBaseConnection.open();
		Iterable<User> result = findAllCommand();
		_dataBaseConnection.close();
		
		return result;
	}

	private void saveCommand(User user) throws SQLException {
		PreparedStatement preparedStatement = _dataBaseConnection.getConnection().prepareStatement(INSERT_USER);
		preparedStatement.setString(1, user.getName());
		preparedStatement.executeUpdate();
	}

	private void updateCommand(User newUser, User oldUser) throws SQLException {
		PreparedStatement preparedStatement = _dataBaseConnection.getConnection().prepareStatement(UPDATE_USER);
		preparedStatement.setString(1, newUser.getName());
		preparedStatement.setString(2, oldUser.getName());
		preparedStatement.executeUpdate();
	}

	private void deleteCommand(User user) throws SQLException {
		PreparedStatement preparedStatement = _dataBaseConnection.getConnection().prepareStatement(DELETE_USER);
		preparedStatement.setString(1, user.getName());
		preparedStatement.executeUpdate();
	}

	private User findByCommand(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	private Iterable<User> findAllCommand() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
