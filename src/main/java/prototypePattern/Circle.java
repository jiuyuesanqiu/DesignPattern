package prototypePattern;

/**  
 * @ClassName: Circle  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午5:38:53  
 *    
 */
public class Circle extends Shape{

	public Circle(){
	     type = "Circle";
	   }
	 
	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
}
