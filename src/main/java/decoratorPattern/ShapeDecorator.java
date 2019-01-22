package decoratorPattern;

/**
 * @ClassName: ShapeDecorator
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 上午9:29:44
 * 
 */
public class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
