package observerPattern;

/**
 * @ClassName: Observer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午9:33:33
 * 
 */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
