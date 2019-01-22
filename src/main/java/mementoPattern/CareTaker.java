package mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CareTaker
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午2:37:26
 * 
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}
