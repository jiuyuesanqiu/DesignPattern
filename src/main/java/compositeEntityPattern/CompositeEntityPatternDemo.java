package compositeEntityPattern;

/**  
 * @ClassName: CompositeEntityPatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:20:12  
 *    
 */
public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
	       Client client = new Client();
	       client.setData("Test", "Data");
	       client.printData();
	       client.setData("Second Test", "Data1");
	       client.printData();
	   }
}
