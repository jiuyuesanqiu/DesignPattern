package interceptingFilterPattern;

/**  
 * @ClassName: DebugFilter  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:25:04  
 *    
 */
public class DebugFilter implements Filter {

	public void execute(String request){
	      System.out.println("request log: " + request);
	   }

}
