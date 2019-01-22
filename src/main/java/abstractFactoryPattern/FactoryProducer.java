package abstractFactoryPattern;

/**  
 * @ClassName: FactoryProducer  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午2:50:32  
 *    
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	   }
}
