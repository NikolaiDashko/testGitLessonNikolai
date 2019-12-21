package HW11;
public class LRUDemo {

	public static void main(String[] args) {

		LRUCache<Integer, Integer> cache1 = new LRUCache<Integer, Integer>();

		for (int i = 0; i < 50; i++) {
			cache1.putSmth(i, i);
		}

		System.out.println(cache1.map1.toString());
		System.out.println(cache1.getSmth(5));

	}
}