package dataAccessObjectPattern;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName: StudentDaoImpl  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:42:30  
 *    
 */
public class StudentDaoImpl implements StudentDao {

	//列表是当作一个数据库
	   List<Student> students;
	 
	   public StudentDaoImpl(){
	      students = new ArrayList<Student>();
	      Student student1 = new Student("Robert",0);
	      Student student2 = new Student("John",1);
	      students.add(student1);
	      students.add(student2);    
	   }
	   @Override
	   public void deleteStudent(Student student) {
	      students.remove(student.getRollNo());
	      System.out.println("Student: Roll No " + student.getRollNo() 
	         +", deleted from database");
	   }
	 
	   //从数据库中检索学生名单
	   @Override
	   public List<Student> getAllStudents() {
	      return students;
	   }
	 
	   @Override
	   public Student getStudent(int rollNo) {
	      return students.get(rollNo);
	   }
	 
	   @Override
	   public void updateStudent(Student student) {
	      students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() 
	         +", updated in the database");
	   }

}
