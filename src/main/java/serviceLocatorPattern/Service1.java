package serviceLocatorPattern;

/**
 * @ClassName: Service1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午8:44:33
 * 
 */
public class Service1 implements Service {

	public void execute() {
		System.out.println("Executing Service1");
	}

	@Override
	public String getName() {
		return "Service1";
	}

}
