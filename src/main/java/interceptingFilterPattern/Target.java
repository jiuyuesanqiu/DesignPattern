package interceptingFilterPattern;

/**  
 * @ClassName: Target  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:25:44  
 *    
 */
public class Target {
	public void execute(String request){
	      System.out.println("Executing request: " + request);
	   }
}
