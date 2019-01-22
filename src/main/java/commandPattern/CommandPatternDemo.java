package commandPattern;

/**
 * @ClassName: CommandPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 上午10:44:18
 * 
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
