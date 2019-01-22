package proxyPattern;

/**
 * @ClassName: ProxyPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:07:55
 * 
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像不需要从磁盘加载
		image.display();
	}
}
