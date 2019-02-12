package serviceLocatorPattern;

/**
 * @ClassName: ServiceLocator
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午8:46:29
 * 
 */
public class ServiceLocator {
	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
