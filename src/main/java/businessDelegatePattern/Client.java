package businessDelegatePattern;

/**
 * @ClassName: Client
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月11日 上午10:06:18
 * 
 */
public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
