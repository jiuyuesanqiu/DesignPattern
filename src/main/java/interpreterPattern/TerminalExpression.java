package interpreterPattern;

/**
 * @ClassName: TerminalExpression
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午1:09:36
 * 
 */
public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
