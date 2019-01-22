package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaSingle
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午3:10:14
 * 
 */
public class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
