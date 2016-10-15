package Hackaton.IniciativaProgramadores.infrastructure.database.repository;

import java.sql.SQLException;

import Hackaton.IniciativaProgramadores.domain.user.User;

public interface UserRepository {
	public void save(User user) throws ClassNotFoundException, SQLException;

	public void update(User newUser, User oldUser) throws ClassNotFoundException, SQLException;

	public void delete(User user) throws ClassNotFoundException, SQLException;

	public User findBy(int id) throws ClassNotFoundException, SQLException;

	public Iterable<User> findAll() throws ClassNotFoundException, SQLException;
}
