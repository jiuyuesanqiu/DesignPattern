package dataAccessObjectPattern;

import java.util.List;

/**  
 * @ClassName: StudentDao  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:41:43  
 *    
 */
public interface StudentDao {
	public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);
}
