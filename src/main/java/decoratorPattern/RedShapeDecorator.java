package decoratorPattern;

/**
 * @ClassName: RedShapeDecorator
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 上午9:30:55
 * 
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
