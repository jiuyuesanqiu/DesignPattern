package interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName: FilterChain  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:26:11  
 *    
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	   private Target target;
	 
	   public void addFilter(Filter filter){
	      filters.add(filter);
	   }
	 
	   public void execute(String request){
	      for (Filter filter : filters) {
	         filter.execute(request);
	      }
	      target.execute(request);
	   }
	 
	   public void setTarget(Target target){
	      this.target = target;
	   }
}
