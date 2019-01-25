package visitorPattern;

/**  
 * @ClassName: Computer  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午2:23:20  
 *    
 */
public class Computer implements ComputerPart{
	ComputerPart[] parts;
	 
	   public Computer(){
	      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
	   }
	 
	 
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
}
