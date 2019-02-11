package interceptingFilterPattern;

/**  
 * @ClassName: InterceptingFilterDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:28:29  
 *    
 */
public class InterceptingFilterDemo {
	public static void main(String[] args) {
	      FilterManager filterManager = new FilterManager(new Target());
	      filterManager.setFilter(new AuthenticationFilter());
	      filterManager.setFilter(new DebugFilter());
	 
	      Client client = new Client();
	      client.setFilterManager(filterManager);
	      client.sendRequest("HOME");
	   }
}
