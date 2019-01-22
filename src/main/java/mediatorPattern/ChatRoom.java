package mediatorPattern;

import java.util.Date;

/**
 * @ClassName: ChatRoom
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午2:08:23
 * 
 */
public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
