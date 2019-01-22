package flyweightPattern;

import java.util.HashMap;

/**
 * @ClassName: ShapeFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午3:36:02
 * 
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
