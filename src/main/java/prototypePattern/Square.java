package prototypePattern;

/**  
 * @ClassName: Square  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午5:37:41  
 *    
 */
public class Square extends Shape{

	public Square(){
		type = "Square";
		}
 
	@Override
	public void draw() {
	   System.out.println("Inside Square::draw() method.");
	}
	
}
