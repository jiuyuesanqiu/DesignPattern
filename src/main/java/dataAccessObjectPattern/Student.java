package dataAccessObjectPattern;

/**  
 * @ClassName: Student  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:41:13  
 *    
 */
public class Student {
	private String name;
	   private int rollNo;
	 
	   Student(String name, int rollNo){
	      this.name = name;
	      this.rollNo = rollNo;
	   }
	 
	   public String getName() {
	      return name;
	   }
	 
	   public void setName(String name) {
	      this.name = name;
	   }
	 
	   public int getRollNo() {
	      return rollNo;
	   }
	 
	   public void setRollNo(int rollNo) {
	      this.rollNo = rollNo;
	   }
}
