package bridge;

/**
 * @ClassName: Circle
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午1:48:29
 * 
 */
public class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
