package transferObjectPattern;

/**
 * @ClassName: TransferObjectPatternDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午9:29:50
 * 
 */
public class TransferObjectPatternDemo {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();

		// 输出所有的学生
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);

		// 获取学生
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
