package businessDelegatePattern;

/**  
 * @ClassName: JMSService  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 上午8:23:34  
 *    
 */
public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
