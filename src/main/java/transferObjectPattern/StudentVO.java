package transferObjectPattern;

/**
 * @ClassName: StudentVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年2月12日 上午9:21:09
 * 
 */
public class StudentVO {
	private String name;
	private int rollNo;

	StudentVO(String name, int rollNo) {
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
