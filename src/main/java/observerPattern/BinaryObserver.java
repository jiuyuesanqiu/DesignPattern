package observerPattern;

/**
 * @ClassName: BinaryObserver
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午9:34:33
 * 
 */
public class BinaryObserver extends Observer{
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}
