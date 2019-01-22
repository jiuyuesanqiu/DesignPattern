package commandPattern;

/**
 * @ClassName: BuyStock
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 上午10:37:40
 * 
 */
public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}

}
