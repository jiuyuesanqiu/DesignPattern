package businessDelegatePattern;

/**
 * @ClassName: BusinessLookUp
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月11日 上午8:24:03
 * 
 */
public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
