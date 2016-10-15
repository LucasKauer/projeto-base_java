package Hackaton.IniciativaProgramadores.infrastructure.dependencyinjection;

import java.util.Hashtable;

public class Provider {

	protected static Provider instance;
	protected Hashtable<Class<?>, Class<?>> classMap;

	protected Provider() {
		this.classMap = new Hashtable<Class<?>, Class<?>>();
	}

	public static Provider getInstance() {
		if (Provider.instance == null)
			Provider.instance = new Provider();
		return Provider.instance;
	}

	public <I, T extends I> void register(Class<I> forInterface, Class<T> toUse) {
		this.classMap.put(forInterface, toUse);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> forInterface) throws DependencyInjectionException {

		if (!this.classMap.containsKey(forInterface))
			throw new DependencyInjectionException("Não há registro para a interface " + forInterface.getName());

		try {
			return (T) this.classMap.get(forInterface).newInstance();
		} catch (Exception e) {
			throw new DependencyInjectionException("Não foi possível instanciar a classe!");
		}
	}
}
