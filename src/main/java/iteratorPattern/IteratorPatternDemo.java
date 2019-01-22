package iteratorPattern;

/**
 * @ClassName: IteratorPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午1:51:50
 * 
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
