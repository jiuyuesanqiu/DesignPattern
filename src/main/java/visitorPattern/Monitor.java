package visitorPattern;

/**  
 * @ClassName: Monitor  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午2:22:10  
 *    
 */
public class Monitor implements ComputerPart{
	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
}
