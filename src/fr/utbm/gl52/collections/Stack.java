package fr.utbm.gl52.collections;

/**
 * Generic method for accessing stack
 * @author Alexandre Guyon
 *
 * @param <E> The param E is used to specify the Type of data toi store in the stack
 */
public interface Stack<E> {

	/**
	 * Add an element to the stack
	 * @param el The element to add to the stack
	 */
	public void push(E el);
	
	/**
	 * Get and removed the last element inserted in the stack
	 * @return The last element in inserted in the stack
	 */
	public E pop();
	
	/**
	 * This method is used for know if the stack is empty or not
	 * @return boolean saying if the stack is empty. false -> not empty ; true otherwise
	 */
	public boolean isEmpty();
	
}
