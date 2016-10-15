package Hackaton.IniciativaProgramadores.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hackaton.IniciativaProgramadores.application.service.UserService;
import Hackaton.IniciativaProgramadores.application.viewmodel.greet.GreetViewModel;
import Hackaton.IniciativaProgramadores.domain.user.User;
import Hackaton.IniciativaProgramadores.domain.user.UserImpl;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.DependencyInjectionException;
import Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection.Provider;

@RestController
public class HomeController {
	
	private UserService _userService;
	
	public HomeController() throws DependencyInjectionException {
		this._userService = Provider.getInstance().get(UserService.class);
	}
	
	@RequestMapping("/user/save")
	public GreetViewModel save(@RequestParam(value = "name", defaultValue = "Default") String name)
			throws DependencyInjectionException {
		
		User user = new UserImpl(name);
		_userService.save(user);
		
		return new GreetViewModel("Usuário Salvo!");
	}
	
	@RequestMapping("/user/update")
	public GreetViewModel update(@RequestParam(value = "newName", defaultValue = "Default Atualizado!") String newName, @RequestParam(value = "newName", defaultValue = "Default") String oldName)
			throws DependencyInjectionException {
		
		User newUser = new UserImpl(newName);
		User oldUser = new UserImpl(oldName);
		
		_userService.update(newUser, oldUser);
		
		return new GreetViewModel("Usuário Atualizado!");
	}
	
	@RequestMapping("/user/delete")
	public GreetViewModel delete(@RequestParam(value = "name", defaultValue = "Default") String name)
			throws DependencyInjectionException {
		
		User user = new UserImpl(name);
		_userService.delete(user);
		
		return new GreetViewModel("Usuário Deletado!");
	}
}
