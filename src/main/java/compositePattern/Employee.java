package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Employee
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午5:29:53
 * 
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	// 构造函数
	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}
}
