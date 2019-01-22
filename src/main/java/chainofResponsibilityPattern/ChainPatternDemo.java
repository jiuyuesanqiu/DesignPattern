package chainofResponsibilityPattern;

/**
 * @ClassName: ChainPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:40:08
 * 
 */
public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
