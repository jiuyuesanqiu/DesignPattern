package chainofResponsibilityPattern;

/**
 * @ClassName: ConsoleLogger
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:31:15
 * 
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}
