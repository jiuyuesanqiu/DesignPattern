package singletonPattern;

/**  
 * @ClassName: SingletonPatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:06:54  
 *    
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		 
	      //不合法的构造函数
	      //编译时错误：构造函数 SingleObject() 是不可见的
	      //SingleObject object = new SingleObject();
	 
	      //获取唯一可用的对象
	      SingleObject object = SingleObject.getInstance();
	 
	      //显示消息
	      object.showMessage();
	   }
}
