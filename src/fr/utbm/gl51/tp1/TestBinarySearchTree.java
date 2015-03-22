/**
 * 
 */
package fr.utbm.gl51.tp1;

import fr.utbm.gl51.collections.ArrayStack;
import fr.utbm.gl51.tree.BinarySearchTree;
import fr.utbm.gl51.tree.BinaryTreeNode;

/**
 * @author Alexandre
 *
 */
public class TestBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack<Integer> array = new ArrayStack<Integer>();
		
		System.out.println("Stack size : " + array.getSize());
		
		array.push(21);
		array.push(23);
		array.push(4);
		array.push(42);
		array.push(22);
		array.push(56);
		array.push(8);
		array.push(35);
		array.push(1);
		array.push(13);
		
		System.out.println("Stack size : " + array.getSize());
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		while(!array.isEmpty())
			bst.insert(array.pop());
		
		for (BinaryTreeNode<Integer> binaryTreeNode : bst)
			System.out.println(binaryTreeNode.getUserData());
		
		System.out.println("Tree nb node : " + bst.getRoot().getChildCount());
		System.out.println("Stack size : " + array.getSize());

	}

}
