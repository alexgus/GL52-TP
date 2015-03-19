/**
 * 
 */
package fr.utbm.gl51.tp1;

import fr.utbm.gl51.collections.ArrayStack;
import fr.utbm.gl51.tree.AVLTree;

/**
 * @author Alexandre
 *
 */
public class TestAVLTree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack<Integer> array = new ArrayStack<Integer>();
		
		System.out.println("Stack size : " + array.getSize());
		
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		array.push(5);
		
		System.out.println("Stack size : " + array.getSize());
		
		AVLTree<Integer> avl = new AVLTree<Integer>();
		
		while(!array.isEmpty())
			avl.insert(array.pop());
	
		System.out.println("Tree size : " + avl.getRoot().getChildCount());
		System.out.println("Stack size : " + array.getSize());
	}
}
