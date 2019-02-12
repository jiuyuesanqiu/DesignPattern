package serviceLocatorPattern;

/**
 * @ClassName: Service2
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午8:44:43
 * 
 */
public class Service2 implements Service {

	public void execute() {
		System.out.println("Executing Service2");
	}

	@Override
	public String getName() {
		return "Service2";
	}

}
