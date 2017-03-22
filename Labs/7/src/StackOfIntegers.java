//Question 10.5
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	public void push(int i) {
		if (size >= elements.length) {
			int[] temp = new int [elements.length * 2];
			System.arraycopy(elements, 0, temp, elements.length, i);
			elements = temp;
		}
		
		elements[size++] = i;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}
	
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}

}
