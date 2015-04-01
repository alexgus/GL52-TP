/**
 * 
 */
package fr.utbm.gl52.launcher;

import fr.utbm.gl52.collections.ArrayStack;

/**
 * This class allow to test the implementation of Array Stack
 * 
 * @author Alexandre Guyon
 *
 */
public class TestArrayStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack<Integer> array = new ArrayStack<>();
		
		System.out.println("Size : " + array.getSize());
		
		array.push(5);
		array.push(5);
		array.push(5);
		array.push(5);
		array.push(5);
		
		System.out.println("Size : " + array.getSize());
		
		array.push(4);
		array.push(4);
		array.push(4);
		array.push(4);
		
		System.out.println("Size : " + array.getSize());
		
		array.push(3);
		array.push(3);
		array.push(3);
		
		System.out.println("Size : " + array.getSize());
		
		array.push(2);
		array.push(2);
		
		System.out.println("Size : " + array.getSize());
		
		array.push(1);
		
		System.out.println("Size : " + array.getSize());
		
		while(!array.isEmpty())
			System.out.println(array.pop());
		
		System.out.println("Size : " + array.getSize());
	}

}
