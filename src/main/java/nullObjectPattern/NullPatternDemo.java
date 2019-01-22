package nullObjectPattern;

/**
 * @ClassName: NullPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:34:50
 * 
 */
public class NullPatternDemo {
	public static void main(String[] args) {

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
