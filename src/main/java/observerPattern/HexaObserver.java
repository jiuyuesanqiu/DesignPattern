package observerPattern;

/**
 * @ClassName: HexaObserver
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午9:35:49
 * 
 */
public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}
