package visitorPattern;

/**  
 * @ClassName: Keyboard  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午2:21:27  
 *    
 */
public class Keyboard implements ComputerPart{

	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }

}
