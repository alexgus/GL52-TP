package fr.utbm.gl52.tree;

/**
 * BinaryTreeNode is one of the implementation of TreeNode.
 * This one has two children (left, right) which are BinaryTreeNode too.
 *
 * @author Alexandre Guyon
 * @param <D> The type of data to store in the abstract tree
 *
 */
public class BinaryTreeNode<D> extends AbstractTreeNode<D, BinaryTreeNode<D>>{

	private static final long serialVersionUID = 2723110454312106880L;

	/**
	 * The left child of this current node
	 */
	private BinaryTreeNode<D> left;
	
	/**
	 * The right child of this current node
	 */
	private BinaryTreeNode<D> right;

	@Override
	public Integer getChildCount() {
		int i = 0;
		if(this.hasLeftChild())
			i = this.left.getChildCount() + 1;
		if(this.hasRightChild())
			i += this.right.getChildCount() + 1;
		return i;
	}
	
	/**
	 * Get the maximum depth of his children
	 * @return the maximum depth of his children
	 */
	public int getMaxDepth(){
		if(this.getLeftDepth() > this.getRightDepth())
			return this.getLeftDepth();
		return this.getRightDepth();
	}
	
	/**
	 * Get the maximum depth of his left child
	 * @return the maximum depth of his left child
	 */
	public int getLeftDepth(){
		if(this.hasLeftChild())
			return this.getLeft().getMaxDepth();
		return this.getDepth();
	}
	
	/**
	 * Get the maximum depth of his right child
	 * @return the maximum depth of his right child
	 */
	public int getRightDepth(){
		if(this.hasRightChild())
			return this.getRight().getMaxDepth();
		return this.getDepth();
	}
	
	/**
	 * Get iteratively the depth of the current node 
	 * @return The depth of the current node
	 */
	public int getDepth(){
		int depth = 1;
		
		BinaryTreeNode<D> node = this;
		while(node!= null && node.hasParentNode()){
			++depth;
			node = node.getParentNode();
		}
		
		return depth;
	}


	/**
	 * Set the left child of the current binary tree node
	 * @return The left child of this node
	 */
	public BinaryTreeNode<D> getLeft() {
		return this.left;
	}
	
	/**
	 * Set the right child of the current binary tree node
	 * @param left Set the left child of this node
	 */
	public void setLeft(BinaryTreeNode<D> left) {
		if(left != null)
			left.setParentNode(this);
		this.left = left;
	}

	/**
	 * Get the right child of the current binary tree node
	 * @return The right child of this node
	 */
	public BinaryTreeNode<D> getRight() {
		return this.right;
	}

	/**
	 * Get the right child of the current binary tree node
	 * @param right Set the right child of this node 
	 */
	public void setRight(BinaryTreeNode<D> right) {
		if(right != null)
			right.setParentNode(this);
		this.right = right;
	}
	
	/**
	 * Check if this node has a left child
	 * @return boolean; true if this node has a left child, false otherwise
	 */
	public boolean hasLeftChild(){
		return (this.left != null);
	}
	
	/**
	 * Check if this node has a right child
	 * @return boolean; true if this node has right child, false otherwise
	 */
	public boolean hasRightChild(){
		return (this.right != null);
	}
	
	@Override
	public String toString(){
		return "Data : " + this.getUserData() + " Depth : " + this.getDepth();
	}
}
