package fr.utbm.gl52.collections;

import java.util.Arrays;

/**
 * Implement array version of stack
 * @param <E> E is the type of data you want to put in the stack
 * @author Alexandre Guyon
 *
 */
public class ArrayStack<E> implements Stack<E>{
	/**
	 * The data to store
	 */
	private Object[] data;

	/**
	 * The size of the data buffer (allocated memory)
	 */
	private Integer size;
	
	/**
	 * The current index (always < size)
	 */
	private Integer currentSize;
	
	/**
	 * The step's size of the growing data buffer
	 */
	private final Integer MIN_ALLOC_SIZE = 3;
	
	/**
	 * The dealloc size. If the currentSize <= (size - MIN_FREE_SIZE), the global size is decreased (deallocation)
	 */
	private final Integer MIN_FREE_SIZE = 2;
	
	/**
	 * The default constructor.
	 * Set the size of the buffer to 0
	 */
	public ArrayStack() {
		this(0);
	}
	
	/**
	 * Create and set the begin size of the stack. Avoid reallocation of memory if the stack is well dimensioned at the beginning. 
	 * @param size 
	 */
	public ArrayStack(int size) {
		this.data = new Object[size];
		this.size = size;
		this.currentSize = 0;
	}
	
	@Override
	public void push(E el) {
		if(this.currentSize + 1 >= this.size){
			this.data = Arrays.copyOf(this.data, this.currentSize + this.MIN_ALLOC_SIZE);
			this.size = this.currentSize + this.MIN_ALLOC_SIZE;
		}
		this.data[this.currentSize] = el;
		this.currentSize++;
	}

	@Override
	public E pop() {
		if(!this.isEmpty()){
			if((this.size - this.currentSize) >= this.MIN_FREE_SIZE){
				this.data = Arrays.copyOf(this.data, this.currentSize);
				this.size = this.currentSize;
			}
			this.currentSize--;
			return (E) this.data[this.currentSize];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(this.currentSize == 0)
			return true;
		return false;
	}

	/**
	 * Get the size of the stack
	 * @return Return the current size of the stack. Can be different from the beginning.
	 */
	public Integer getSize() {
		return this.size;
	}

	/**
	 * Resize the stack. Be careful of data loss.
	 * @param size The new size of the stack
	 */
	public void setSize(Integer size) {
		this.data = Arrays.copyOf(this.data, size);
		this.size = size;
	}

	/**
	 * The current index of the stack.
	 * The number of element in the stack.
	 * @return Integer corresponding to the number of element in the stack.
	 */
	public Integer getCurrentSize() {
		return this.currentSize;
	}
	
}
