/**
 * 
 */
package fr.utbm.gl51.tp1;

import fr.utbm.gl51.collections.ArrayStack;
import fr.utbm.gl51.tree.AVLTree;
import fr.utbm.gl51.tree.BinarySearchTree;
import fr.utbm.gl51.tree.BinaryTreeNode;

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
		
		array.push(67);
		array.push(72);
		array.push(54);
		array.push(76);
		array.push(19);
		array.push(23);
		array.push(12);
		array.push(14);
		array.push(9);
		array.push(17);
		array.push(50);
		
		System.out.println("Stack size : " + array.getSize());
		
		BinarySearchTree<Integer> avl = new AVLTree<Integer>();
		
		while(!array.isEmpty())
			avl.insert(array.pop());
		
		for (BinaryTreeNode<Integer> binaryTreeNode : avl)
			System.out.println(binaryTreeNode.getUserData());
		
		System.out.println("Tree nb node : " + avl.getRoot().getChildCount());
		System.out.println("Stack size : " + array.getSize());
	}
}
