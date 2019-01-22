package mementoPattern;

/**
 * @ClassName: Originator
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午2:36:17
 * 
 */
public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}
}
