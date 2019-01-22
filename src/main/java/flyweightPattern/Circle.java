package flyweightPattern;

/**
 * @ClassName: Circle
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午3:26:42
 * 
 */
public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}

}
