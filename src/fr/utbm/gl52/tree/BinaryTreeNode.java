package fr.utbm.gl52.tree;

/**
 * BinaryTreeNode is one of the implementation of TreeNode.
 * This one has two children (left, right) which are BinaryTreeNode too.
 *
 * @author aguyon
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
	
	/**
	 * This attribute defines the deep value of this node
	 */
	private int depth;

	@Override
	public Integer getChildCount() {
		Integer i = 0;
		if(this.hasLeftChild())
			i = this.left.getChildCount() + 1;
		if(this.hasRightChild())
			i += this.right.getChildCount() + 1;
		return i;
	}
	
	public int getMaxDepth(){
		if(this.getLeftDepth() > this.getRightDepth())
			return this.getLeftDepth();
		return this.getRightDepth();
	}
	
	public int getLeftDepth(){
		if(this.hasLeftChild())
			return this.getLeft().getMaxDepth();
		return this.getDepth();
	}
	
	public int getRightDepth(){
		if(this.hasRightChild())
			return this.getRight().getMaxDepth();
		return this.getDepth();
	}


	/**
	 * Set the left child of the current binary tree node
	 */
	public BinaryTreeNode<D> getLeft() {
		return left;
	}
	
	private void increaseDeep(BinaryTreeNode<D> node){
		node.setDepth(this.getDepth()+1);
	}
	
	/**
	 * Set the right child of the current binary tree node
	 */
	public void setLeft(BinaryTreeNode<D> left) {
		if(left != null){
			this.increaseDeep(left);
			left.setParentNode(this);
		}
		this.left = left;
	}

	/**
	 * Get the left child of the current binary tree node
	 */
	public BinaryTreeNode<D> getRight() {
		return right;
	}

	/**
	 * Get the right child of the current binary tree node
	 */
	public void setRight(BinaryTreeNode<D> right) {
		if(right != null){
			this.increaseDeep(right);
			right.setParentNode(this);
		}
		this.right = right;
	}
	
	public int getDepth() {
		return depth;
	}

	public void setDepth(int deep) {
		this.depth = deep;
	}
	
	public boolean hasLeftChild(){
		return (this.left != null);
	}
	
	public boolean hasRightChild(){
		return (this.right != null);
	}
	
	public String toString(){
		return "Depth : " + this.getDepth() + " Data : " + this.getUserData();
	}
}
