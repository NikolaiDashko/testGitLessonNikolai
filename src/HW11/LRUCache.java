package HW11;
import java.util.LinkedHashMap;

public class LRUCache<K, V> {

	LinkedHashMap<K, V> map1 = new LinkedHashMap<K, V>();

	public void putSmth(K key, V value) {
		map1.put(key, value);
	}

	public V getSmth(K key) {
		if (map1.containsKey(key)) {
			return map1.get(key);
		} else {
			return null;
		}
	}
}