package Hackaton.IniciativaProgramadores.application.service;

import java.sql.SQLException;

import Hackaton.IniciativaProgramadores.domain.user.User;
import Hackaton.IniciativaProgramadores.infrastructure.database.repository.UserRepository;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.DependencyInjectionException;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.Provider;

public class UserServiceImpl implements UserService {

	private UserRepository _userRepository;
	
	public UserServiceImpl() throws DependencyInjectionException {
		_userRepository = Provider.getInstance().get(UserRepository.class);
	}
	
	@Override
	public void save(User user) {
		try {
			_userRepository.save(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(User newUser, User oldUser) {
		try {
			_userRepository.update(newUser, oldUser);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(User user) {
		try {
			_userRepository.delete(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
