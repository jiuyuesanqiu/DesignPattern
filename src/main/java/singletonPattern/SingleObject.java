package singletonPattern;

/**  
 * @ClassName: SingleObject  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:05:13  
 *    
 */
public class SingleObject {
	//创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();
	
	//让构造函数为 private，这样该类就不会被实例化
	private SingleObject(){}
	
	//获取唯一可用的对象
	public static SingleObject getInstance(){
	   return instance;
	}
	
	public void showMessage(){
	   System.out.println("Hello World!");
	}
}
