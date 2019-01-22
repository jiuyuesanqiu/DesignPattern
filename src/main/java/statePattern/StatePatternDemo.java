package statePattern;

/**
 * @ClassName: StatePatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:13:24
 * 
 */
public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
