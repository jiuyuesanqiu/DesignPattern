package interpreterPattern;

/**
 * @ClassName: OrExpression
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午1:10:26
 * 
 */
public class OrExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
