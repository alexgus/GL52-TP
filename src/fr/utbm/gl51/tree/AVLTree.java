/**
 * 
 */
package fr.utbm.gl51.tree;

/**
 * Implementation of AVL tree.
 * It is search binary tree which automatically equilibrate itself
 * 
 * @author aguyon
 *
 */
public class AVLTree<D extends Comparable<D>> extends BinarySearchTree<D> {

	private static final long serialVersionUID = 5485618973922447250L;
	
	/**
	 * Check if the node give is needed to be rebalance or not
	 * @param node The node with its two sons to test (if this node is valid for being an AVL)
	 * @return true if this node and its two sons are valid for an AVL tree
	 */
	public boolean checkValid(BinaryTreeNode<D> node){
		return (this.checkValidLeft(node) && this.checkValidRight(node));
	}
	
	public boolean checkValidRight(BinaryTreeNode<D> node){
		return  node.hasRightChild()?
				(node.getUserData().compareTo(node.getRight().getUserData()) >= 0):true;
	}
	
	public boolean checkValidLeft(BinaryTreeNode<D> node){
		return  node.hasLeftChild()?
				(node.getUserData().compareTo(node.getLeft().getUserData()) >= 0):true;
	}
	
	public void rebalance(){
		this.rebalance(this.getRoot());
	}
	
	public void rebalance(BinaryTreeNode<D> node){
		if(this.checkValid(node)){
			if(node.hasLeftChild())
				this.rebalance(node.getLeft());
			if(node.hasRightChild())
				this.rebalance(node.getRight());
		}else{
			this.rotateRight(node);
			this.rebalance(node);
		}
	}
}
