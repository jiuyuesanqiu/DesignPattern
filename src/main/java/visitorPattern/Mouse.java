package visitorPattern;

/**  
 * @ClassName: Mouse  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午2:22:50  
 *    
 */
public class Mouse implements ComputerPart{
	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
}
