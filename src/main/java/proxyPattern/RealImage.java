package proxyPattern;

/**
 * @ClassName: RealImage
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月18日 下午4:06:21
 * 
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
