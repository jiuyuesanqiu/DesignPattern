package prototypePattern;

/**  
 * @ClassName: Rectangle  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午5:36:46  
 *    
 */
public class Rectangle extends Shape{

	public Rectangle(){
	     type = "Rectangle";
	   }
	 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }

}
