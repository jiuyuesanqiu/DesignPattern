package interceptingFilterPattern;

/**  
 * @ClassName: FilterManager  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:27:35  
 *    
 */
public class FilterManager {
	FilterChain filterChain;
	 
	   public FilterManager(Target target){
	      filterChain = new FilterChain();
	      filterChain.setTarget(target);
	   }
	   public void setFilter(Filter filter){
	      filterChain.addFilter(filter);
	   }
	 
	   public void filterRequest(String request){
	      filterChain.execute(request);
	   }
}
