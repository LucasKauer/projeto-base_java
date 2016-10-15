package Hackaton.IniciativaProgramadores.api.configuration;

import Hackaton.IniciativaProgramadores.application.service.UserService;
import Hackaton.IniciativaProgramadores.application.service.UserServiceImpl;
import Hackaton.IniciativaProgramadores.infrastructure.database.configuration.DataBaseConnection;
import Hackaton.IniciativaProgramadores.infrastructure.database.configuration.mysql.MySqlConnection;
import Hackaton.IniciativaProgramadores.infrastructure.database.repository.UserRepository;
import Hackaton.IniciativaProgramadores.infrastructure.database.repository.UserRepositoryImpl;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.Provider;

public class ProviderConfiguration {

	private static Provider provider = Provider.getInstance();

	public static void run() {
		configureDatabaseConnection();
		configureRepositories();
		configureServices();
	}

	private static void configureDatabaseConnection() {
		provider.register(DataBaseConnection.class, MySqlConnection.class);
	}

	private static void configureRepositories() {
		provider.register(UserRepository.class, UserRepositoryImpl.class);
	}
	
	private static void configureServices() {
		provider.register(UserService.class, UserServiceImpl.class);
	}
}