package decoratorPattern;

/**
 * @ClassName: DecoratorPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 上午9:33:05
 * 
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
