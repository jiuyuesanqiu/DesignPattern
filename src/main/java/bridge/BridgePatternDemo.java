package bridge;

/**
 * @ClassName: BridgePatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午1:50:04
 * 
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
