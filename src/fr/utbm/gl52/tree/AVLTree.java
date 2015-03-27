/**
 * 
 */
package fr.utbm.gl52.tree;

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
		if(d.hasParentNode())
			this.rebalance(d.getParentNode());
	}
	
	public void rebalance(){
		this.rebalance(this.getRoot());
	}
	
	public void rebalance(BinaryTreeNode<D> node){
		if(node != null){
			if(node.getLeftDepth() < node.getRightDepth()){
				this.rotateLeft(node);
				if(node.getParentNode().hasParentNode())
					this.rebalance(node.getParentNode().getParentNode());
			}else{
				this.rotateRight(node);
				if(node.getParentNode().hasParentNode())
					this.rebalance(node.getParentNode().getParentNode());
			}
		}
	}
}
