package Hackaton.IniciativaProgramadores.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Hackaton.IniciativaProgramadores.api.configuration.ProviderConfiguration;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ProviderConfiguration.run();
		SpringApplication.run(App.class, args);
	}
}
