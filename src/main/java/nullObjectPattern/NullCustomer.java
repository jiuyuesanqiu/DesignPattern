package nullObjectPattern;

/**
 * @ClassName: NullCustomer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月22日 上午10:34:17
 * 
 */
public class NullCustomer extends AbstractCustomer {
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}
