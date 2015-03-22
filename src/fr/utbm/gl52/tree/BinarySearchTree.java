/**
 * 
 */
package fr.utbm.gl52.tree;

/**
 * @author aguyon
 *
 */
public class BinarySearchTree<D extends Comparable<D>> extends BinaryTree<D> {

	private static final long serialVersionUID = -2577348842035448431L;
	
	/**
	 * Insert in the tree
	 * @param d The node to insert
	 */
	public void insert(BinaryTreeNode<D> d){
		if(this.isEmpty()){
			d.setDepth(1);
			this.setRoot(d);
		}
		else{
			this.insert(this.getRoot(), d);
		}
	}
	
	/**
	 * Insert this data in the tree
	 * @param d The node to insert
	 */
	public void insert(D d){
		BinaryTreeNode<D> node = new BinaryTreeNode<D>();
		node.setUserData(d);
		this.insert(node);
	}
	
	/**
	 * Insert recursively a node in the tree
	 * @param nodeRef The node to test the insertion
	 * @param toInsert The node to insert
	 */
	public void insert(BinaryTreeNode<D> nodeRef, BinaryTreeNode<D> toInsert){
		// Test if we should insert right or left for equilibrate
		if(nodeRef.getUserData().compareTo(toInsert.getUserData()) > 0){
			if(!nodeRef.hasLeftChild())
				nodeRef.setLeft(toInsert);
			else
				this.insert(nodeRef.getLeft(), toInsert);
		}
		else{
			if(!nodeRef.hasRightChild())
				nodeRef.setRight(toInsert);
			else
				this.insert(nodeRef.getRight(), toInsert);
		}
	}
	
	/**
	 * Allow to rotate 3 contiguous values of binary node
	 * @param node The node and its sons to rotate
	 */
	public void rotateRight(BinaryTreeNode<D> node){
		if(node.hasLeftChild()){ // if no left, can not rotate
			
			BinaryTreeNode<D> tmp = null;
			if(node.getLeft().getRight() != null){
				tmp = node.getLeft().getRight();
			}
			
			if(node != this.getRoot()){
				if(node.getParentNode().getLeft() == node)
					node.getParentNode().setLeft(node.getLeft());
				else
					node.getParentNode().setRight(node.getLeft());
			}else{
				this.setRoot(node.getLeft());
				node.getLeft().setParentNode(null);
			}
			
			node.getLeft().setRight(node);
			
			node.setLeft(tmp);
			
			node.setDepth(node.getDepth()-1);
			node.getParentNode().setDepth(node.getParentNode().getDepth()+1);
			if(node.getParentNode().hasLeftChild())
				node.getParentNode().getLeft().setDepth(node.getParentNode().getLeft().getDepth()+1);
		}
	}
	
	public void rotateLeft(BinaryTreeNode<D> node){
		if(node.hasRightChild()){ // if no left, can not rotate
			
			BinaryTreeNode<D> tmp = null;
			if(node.getRight().getLeft() != null){
				tmp = node.getRight().getLeft();
			}
			
			if(node.getParentNode().getRight() == node)
				node.getParentNode().setRight(node.getRight());
			else
				node.getParentNode().setLeft(node.getRight());
			
			node.getRight().setParentNode(node.getParentNode());
			node.getRight().setLeft(node);
			
			node.setRight(tmp);
		}
	}

}
