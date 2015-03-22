/**
 * 
 */
package fr.utbm.gl51.tp1;

import fr.utbm.gl51.collections.ArrayStack;
import fr.utbm.gl51.tree.BinaryTree;
import fr.utbm.gl51.tree.BinaryTreeNode;

/**
 * @author aguyon
 *
 */
public class TestBinaryTree {
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
		
		BinaryTree<Integer> btree = new BinaryTree<Integer>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.setUserData(array.pop());
		btree.setRoot(root);
		
		while(!array.isEmpty()){
			BinaryTreeNode<Integer> g = new BinaryTreeNode<Integer>();
			g.setUserData(array.pop());
			root.setLeft(g);
			root = g;
		}
		
		for (BinaryTreeNode<Integer> binaryTreeNode : btree)
			System.out.println(binaryTreeNode.getUserData());
	
		System.out.println("Tree size : " + btree.getRoot().getChildCount());
		System.out.println("Stack size : " + array.getSize());
	}
}
