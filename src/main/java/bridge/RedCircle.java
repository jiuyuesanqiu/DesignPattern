package bridge;

/**  
 * @ClassName: RedCircle  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:46:18  
 *    
 */
public class RedCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
