/**
 * 
 */
package fr.utbm.gl52.launcher;

import fr.utbm.gl52.collections.ArrayStack;
import fr.utbm.gl52.tree.AVLTree;
import fr.utbm.gl52.tree.BinarySearchTree;
import fr.utbm.gl52.tree.BinaryTreeNode;

/**
 * This class allows to use an arraystack and AVL for doing heap sort
 * 
 * @author Alexandre Guyon
 *
 */
public class TestAVLTree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack<Integer> array = new ArrayStack<>();
		
		System.out.println("Stack size : " + array.getSize());
		
		array.push(50);
		array.push(67);
		array.push(4);
		array.push(3);
		array.push(72);
		array.push(9);
		array.push(54);
		array.push(12);
		array.push(8);
		array.push(14);
		array.push(7);
		array.push(1);
		array.push(76);
		array.push(2);
		array.push(19);
		array.push(23);
		array.push(6);
		array.push(5);
		
		System.out.println("Stack size : " + array.getSize());
		
		BinarySearchTree<Integer> avl = new AVLTree<>();
		
		while(!array.isEmpty())
			avl.insert(array.pop());
		
		for (BinaryTreeNode<Integer> binaryTreeNode : avl)
			System.out.println(binaryTreeNode);
		
		System.out.println("Tree nb node : " + (avl.getRoot().getChildCount() + 1));
		System.out.println("Stack size : " + array.getSize());
	}
}
