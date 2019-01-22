package abstractFactoryPattern;

/**  
 * @ClassName: AbstractFactory  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午2:47:20  
 *    
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
