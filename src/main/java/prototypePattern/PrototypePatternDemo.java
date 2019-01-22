package prototypePattern;

/**  
 * @ClassName: PrototypePatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午5:42:37  
 *    
 */
public class PrototypePatternDemo {
	public static void main(String[] args) {
	      ShapeCache.loadCache();
	 
	      Shape clonedShape = ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());
	 
	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());        
	 
	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());        
	   }
}
