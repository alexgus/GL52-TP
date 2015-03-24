/**
 * 
 */
package fr.utbm.gl52.tp1;

import fr.utbm.gl52.collections.ArrayStack;
import fr.utbm.gl52.tree.AVLTree;
import fr.utbm.gl52.tree.BinarySearchTree;
import fr.utbm.gl52.tree.BinaryTreeNode;

/**
 * @author aguyon
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
		
		avl.rotateRight(avl.getRoot().getLeft().getLeft().getRight());
		avl.rotateLeft(avl.getRoot().getLeft().getLeft());
		
		avl.rotateRight(avl.getRoot().getRight());
		avl.rotateRight(avl.getRoot().getRight().getRight());
		avl.rotateLeft(avl.getRoot().getRight());
		
		for (BinaryTreeNode<Integer> binaryTreeNode : avl)
			System.out.println(binaryTreeNode);
		
		System.out.println("Tree nb node : " + avl.getRoot().getChildCount());
		System.out.println("Stack size : " + array.getSize());
	}
}
