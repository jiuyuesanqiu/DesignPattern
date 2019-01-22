package mediatorPattern;

/**  
 * @ClassName: MediatorPatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月21日 下午2:10:20  
 *    
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");
	 
	      robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
