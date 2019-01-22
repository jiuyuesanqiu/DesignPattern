package nullObjectPattern;

/**
 * @ClassName: CustomerFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:34:37
 * 
 */
public class CustomerFactory {
	public static final String[] names = { "Rob", "Joe", "Julie" };

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
