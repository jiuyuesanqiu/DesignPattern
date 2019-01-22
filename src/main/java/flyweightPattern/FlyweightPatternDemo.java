package flyweightPattern;

/**
 * @ClassName: FlyweightPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午3:36:39
 * 
 */
public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
