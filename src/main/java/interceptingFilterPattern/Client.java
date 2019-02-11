package interceptingFilterPattern;

/**  
 * @ClassName: Client  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:28:09  
 *    
 */
public class Client {
	FilterManager filterManager;
	 
	   public void setFilterManager(FilterManager filterManager){
	      this.filterManager = filterManager;
	   }
	 
	   public void sendRequest(String request){
	      filterManager.filterRequest(request);
	   }
}
