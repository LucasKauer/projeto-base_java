package Hackaton.IniciativaProgramadores.domain.user;

public class UserImpl implements User {

	private String name;
	
	public UserImpl (String name) {
		setName(name);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
}
