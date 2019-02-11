package businessDelegatePattern;

/**
 * @ClassName: BusinessDelegatePatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月11日 上午10:19:04
 * 
 */
public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
