package businessDelegatePattern;

/**  
 * @ClassName: EJBService  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 上午8:22:36  
 *    
 */
public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}

}
