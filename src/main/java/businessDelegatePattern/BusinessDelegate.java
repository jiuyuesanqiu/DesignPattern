package businessDelegatePattern;

/**
 * @ClassName: BusinessDelegate
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月11日 上午8:24:35
 * 
 */
public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
