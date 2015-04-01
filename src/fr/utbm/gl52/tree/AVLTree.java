/**
 * 
 */
package fr.utbm.gl52.tree;

/**
 * Implementation of AVL tree.
 * It is search binary tree which automatically equilibrate itself
 * 
 * @author Alexandre Guyon
 * @param <D> 
 *
 */
public class AVLTree<D extends Comparable<D>> extends BinarySearchTree<D> {

	private static final long serialVersionUID = 5485618973922447250L;
	
	@Override
	public void insert(BinaryTreeNode<D> d){
		super.insert(d);
		if(d.hasParentNode())
			this.rebalance(d.getParentNode());
	}
	
	/**
	 * Check if the specified node is right balanced or not and correct it.
	 * @param node The node to check right and left's high
	 */
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
