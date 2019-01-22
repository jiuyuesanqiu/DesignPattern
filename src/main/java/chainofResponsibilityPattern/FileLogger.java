package chainofResponsibilityPattern;

/**
 * @ClassName: FileLogger
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:32:36
 * 
 */
public class FileLogger extends AbstractLogger {
	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
