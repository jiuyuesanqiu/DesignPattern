package facadePattern;

/**
 * @ClassName: FacadePatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 上午10:33:36
 * 
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
