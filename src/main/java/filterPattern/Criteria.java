package filterPattern;

import java.util.List;

/**
 * @ClassName: Criteria
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午3:05:50
 * 
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
