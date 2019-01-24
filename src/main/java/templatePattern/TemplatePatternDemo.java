package templatePattern;

/**  
 * @ClassName: TemplatePatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午1:40:59  
 *    
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
   }
}
