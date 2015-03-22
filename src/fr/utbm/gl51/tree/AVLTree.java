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
	
	public void insert(BinaryTreeNode<D> d){
		super.insert(d);
		if(d.hasParentNode() && d.getParentNode().hasParentNode())
			this.rebalance(d.getParentNode().getParentNode());
	}
	
	/**
	 * Check if the node give is needed to be rebalance or not
	 * @param node The node with its two sons to test (if this node is valid for being an AVL)
	 * @return true if this node and its two sons are valid for an AVL tree
	 */
	public boolean checkValid(BinaryTreeNode<D> node){
		if((node.getLeftDepth() - node.getRightDepth()) > 1
				|| (node.getLeftDepth() - node.getRightDepth()) < -1)
			return false;
		return true;
	}
	
	public void rebalance(){
		this.rebalance(this.getRoot());
	}
	
	public void rebalance(BinaryTreeNode<D> node){
		if(!this.checkValid(node)){
			this.rotateRight(node);
			if(node.hasLeftChild())
				this.rebalance(node.getLeft());
			this.rotateLeft(node);
			if(node.hasRightChild())
				this.rebalance(node.getRight());
		}
	}
}
