package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Broker
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 上午10:43:35
 * 
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
