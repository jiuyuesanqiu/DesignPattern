package nullObjectPattern;

/**
 * @ClassName: AbstractCustomer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:33:35
 * 
 */
public abstract class AbstractCustomer {
	protected String name;

	public abstract boolean isNil();

	public abstract String getName();
}
