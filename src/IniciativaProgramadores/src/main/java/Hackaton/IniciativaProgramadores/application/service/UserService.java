package Hackaton.IniciativaProgramadores.application.service;

import Hackaton.IniciativaProgramadores.domain.user.User;

public interface UserService {

	void save(User user);

	void update(User newUser, User oldUser);

	void delete(User user);
}
