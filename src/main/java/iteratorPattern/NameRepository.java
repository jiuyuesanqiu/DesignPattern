package iteratorPattern;

/**
 * @ClassName: NameRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月21日 下午1:50:58
 * 
 */
public class NameRepository implements Container {

	public String names[] = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}

}
