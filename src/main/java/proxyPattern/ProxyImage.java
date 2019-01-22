package proxyPattern;

/**
 * @ClassName: ProxyImage
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:07:36
 * 
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
