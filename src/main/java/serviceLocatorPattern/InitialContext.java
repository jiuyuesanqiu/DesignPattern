package serviceLocatorPattern;

/**
 * @ClassName: InitialContext
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午8:45:32
 * 
 */
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
