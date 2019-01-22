package mediatorPattern;

/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午2:08:43
 * 
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
