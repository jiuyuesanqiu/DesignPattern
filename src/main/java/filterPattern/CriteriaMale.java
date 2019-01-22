package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaMale
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午3:06:36
 * 
 */
public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
