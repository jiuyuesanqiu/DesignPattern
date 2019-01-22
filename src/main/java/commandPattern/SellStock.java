package commandPattern;

/**
 * @ClassName: SellStock
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 上午10:41:25
 * 
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
