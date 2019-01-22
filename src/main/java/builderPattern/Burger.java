package builderPattern;

/**  
 * @ClassName: Burger  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:47:43  
 *    
 */
public abstract class Burger implements Item {
	
	public Packing packing() {
      return new Wrapper();
   }
	 
   public abstract float price();
}
