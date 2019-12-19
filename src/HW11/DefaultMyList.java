package HW11;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DefaultMyList<T> implements MyList, ListIterable {
	private static final Object[] EMPTY_ARRAY = {};
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	private Object[] array;
	final private static int START_SIZE = 10;
	private int size;

	public DefaultMyList() {
		this.array = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}

	public DefaultMyList(int size) {
		if (size > 0) {
			this.array = new Object[size];
			this.size = size;
		} else if (size == 0) {
			this.array = EMPTY_ARRAY;
			this.size = size;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + size);
		}
	}

	public DefaultMyList(Collection<? extends T> c) {
		array = c.toArray();
		if ((size = array.length) != 0) {
			if (array.getClass() != Object[].class)
				array = Arrays.copyOf(array, size, Object[].class);
		} else {
			this.array = EMPTY_ARRAY;
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////

	public void add(Object e) {
		int minCapac;
		if (array == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			minCapac = Math.max(START_SIZE, size + 1);
		} else {
			minCapac = size + 1;
		}
		if (minCapac - array.length > 0) {
			int oldCapacity = array.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			if (newCapacity - minCapac < 0)
				newCapacity = minCapac;
			array = Arrays.copyOf(array, newCapacity);
		}
		array[size++] = e;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
		size = 0;
	}

	public boolean remove(Object o) {
		for (int index = 0; index < size; index++) {
			if (o.equals(array[index])) {
				int numMoved = size - index - 1;
				if (numMoved > 0)
					System.arraycopy(array, index + 1, array, index, numMoved);
				array[--size] = null;
				return true;
			}
		}
		return false;
	}

	public Object[] toArray() {
		return Arrays.copyOf(array, size);
	}

	public int size() {
		return size;
	}

	public boolean contains(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(array[i]))
				return true;
		}
		return false;
	}

	public boolean containsAll(MyList c) {
		Object[] mylistArray = c.toArray();
		for (int i = 0; i < mylistArray.length; i++) {
			if (!(contains(mylistArray[i])))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		if (array == null)
			return "{null}";
		int iMax = array.length - 1;
		if (iMax == -1)
			return "{[]}";
		StringBuilder b = new StringBuilder();
		b.append('{');
		for (int i = 0;; i++) {
			b.append(String.valueOf("[" + array[i] + "]"));
			if (i == iMax)
				return b.append('}').toString();
			b.append(", ");
		}
	}

	///////////////////////////////// Iterator/////////////////////////////////////////

	public Iterator<Object> iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {
		public int cursor; // index of next element to return
		public int lastRet = -1; // index of last element returned; -1 if no such
		
		public int count = 0;

		IteratorImpl() {
		}

		public boolean hasNext() {
			return cursor != size;
		}

		@SuppressWarnings("unchecked")
		public Object next() {
			int i = cursor;
			if (i >= size)
				throw new NoSuchElementException();
			Object[] array = DefaultMyList.this.array;
			if (i >= array.length)
				throw new ConcurrentModificationException();
			cursor = i + 1;
			count++;
			return (T) array[lastRet = i];
		}

		public void remove() {
			if (lastRet < 0 || count == 0) // Если не был вызван next, lastRet останется -1
								// Если до remove был вызван remove, lastRet будет -1
				throw new IllegalStateException();
			if (lastRet >= size)
				throw new IndexOutOfBoundsException();
			int numMoved = size - lastRet - 1;
			if (numMoved > 0)
				System.arraycopy(array, lastRet + 1, array, lastRet, numMoved);
			array[--size] = null;
			cursor = lastRet;
			lastRet = -1;
			count = 0;
		}
	}
///////////////////////////////// ListIterator/////////////////////////////////////////

	@SuppressWarnings("rawtypes")
	public ListIterator listIterator() {
		return new ListIteratorImpl();
	}
///////////////////////////////// НЕ РАБОТАЕТ/////////////////////////////////////////

	@SuppressWarnings("rawtypes")
	private class ListIteratorImpl extends IteratorImpl implements ListIterator {

		ListIteratorImpl() {
		}

		public boolean hasPrevious() {
			return cursor != 0;
		}

		@SuppressWarnings("unchecked")
		public Object previous() {
			int i = cursor - 1;
			if (i < 0)
				throw new NoSuchElementException();
			cursor = i;
			count++;
			return (T) array[lastRet = i];
		}

		public void set(Object e) {
			if (lastRet < 0 || count == 0)
				throw new IllegalStateException();
			array[lastRet] = e;
			count=0;
		}

		public void remove() {
			if (lastRet < 0 || count == 0)
				throw new IllegalStateException();
			if (lastRet >= size)
				throw new IndexOutOfBoundsException();

			int numMoved = size - lastRet - 1;
			if (numMoved > 0)
				System.arraycopy(array, lastRet + 1, array, lastRet, numMoved);
			array[--size] = null;
			cursor = lastRet;
			lastRet = -1;
			count = 0;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void add(Object e) {
			// TODO Auto-generated method stub
			
		}
	}

}