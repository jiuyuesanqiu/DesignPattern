package abstractFactoryPattern;

/**  
 * @ClassName: ColorFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午2:49:32  
 *    
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
