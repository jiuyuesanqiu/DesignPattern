package serviceLocatorPattern;

/**
 * @ClassName: ServiceLocatorPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午8:46:52
 * 
 */
public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
