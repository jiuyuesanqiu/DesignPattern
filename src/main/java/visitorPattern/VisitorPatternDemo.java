package visitorPattern;

/**
 * @ClassName: VisitorPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月24日 下午2:24:47
 * 
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}