package filterPattern;

/**
 * @ClassName: Person
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午3:05:06
 * 
 */
public class Person {
	private String name;
	private String gender;
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}
}
