package observerPattern;

/**
 * @ClassName: OctalObserver
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午9:34:59
 * 
 */
public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}
