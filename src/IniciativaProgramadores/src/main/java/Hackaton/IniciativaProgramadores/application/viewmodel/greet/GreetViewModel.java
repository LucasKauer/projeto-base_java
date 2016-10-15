package Hackaton.IniciativaProgramadores.application.viewmodel.greet;

public class GreetViewModel {

	private String message;

	public GreetViewModel(String message) {
		this.setMessage(message);
	}

	public String getMessage()
	{
		return this.message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

}
