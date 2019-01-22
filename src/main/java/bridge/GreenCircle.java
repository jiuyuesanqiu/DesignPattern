package bridge;

/**  
 * @ClassName: GreenCircle  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:46:48  
 *    
 */
public class GreenCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
