package commandPattern;

/**
 * @ClassName: Stock
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 上午10:36:37
 * 
 */
public class Stock {
	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] sold");
	}
}
