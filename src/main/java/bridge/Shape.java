package bridge;

/**
 * @ClassName: Shape
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午1:47:11
 * 
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
