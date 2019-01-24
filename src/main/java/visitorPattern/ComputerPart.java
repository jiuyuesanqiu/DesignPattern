package visitorPattern;

/**  
 * @ClassName: ComputerPart  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午2:21:09  
 *    
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
