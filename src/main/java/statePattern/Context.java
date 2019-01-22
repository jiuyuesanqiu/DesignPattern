package statePattern;

/**
 * @ClassName: Context
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:13:02
 * 
 */
public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
