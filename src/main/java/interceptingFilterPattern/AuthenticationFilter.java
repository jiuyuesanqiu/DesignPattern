package interceptingFilterPattern;

/**  
 * @ClassName: AuthenticationFilter  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午3:24:19  
 *    
 */
public class AuthenticationFilter implements Filter{
	public void execute(String request){
	      System.out.println("Authenticating request: " + request);
	   }
}
