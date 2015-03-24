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
	 * @param a The node and its sons to rotate
	 */
	public void rotateRight(BinaryTreeNode<D> a){
		if(a.hasLeftChild()){ // if no left, can not rotate
			
			/* Rotate right around a
			 *               x (parent)
			 *              / 
			 *             a
			 *            / \
			 *           b   ...
			 *          / \
			 *       ...   e
			 *         
			 * give :
			 * 
			 *               x (parent)
			 *              / 
			 *             b
			 *            / \
			 *         ...   a
			 *              / \
			 *             e   ...
			 * 
			 */
			
			
			BinaryTreeNode<D> b,e,parent;
			
			// Set all variables
			b = a.getLeft();
			if(a != this.getRoot())
				parent = a.getParentNode();
			else
				parent = null;
			if(a.getLeft() != null && a.getLeft().getRight() != null)
				e = a.getLeft().getRight();
			else
				e = null;
			
			if(parent != null){ // attach correctly the parent node 
				if(parent.getLeft() == a)
					parent.setLeft(b);
				else
					parent.setRight(b);
			}else{ // handle root
				this.setRoot(b);
				b.setParentNode(null);
			}
			
			b.setRight(a);
			a.setLeft(e);
			
			// Set depth
			/*a.setDepth(a.getDepth()-1);
			b.setDepth(b.getDepth()+1);*/
			
			// decrease the depth of left children of b
			BinaryTree<D> btree = new BinaryTree<D>();
			btree.setRoot(b.getLeft());
			for (BinaryTreeNode<D> binaryTreeNode : btree)
				binaryTreeNode.setDepth(binaryTreeNode.getDepth() - 1);
			
			// increase the depht of right chlidren of a
			btree.setRoot(a.getRight());
			for (BinaryTreeNode<D> binaryTreeNode : btree)
				binaryTreeNode.setDepth(binaryTreeNode.getDepth() + 1);
		}
	}
	
	public void rotateLeft(BinaryTreeNode<D> a){
		if(a.hasRightChild()){ // if no left, can not rotate
			
			/* Rotate left around a
			 *               x (parent)
			 *              / 
			 *             a
			 *            / \
			 *         ...   b
			 *              / \
			 *             e   ...
			 *         
			 * give :
			 * 
			 *               x (parent)
			 *              / 
			 *             b
			 *            / \
			 *           a   ...
			 *          / \
			 *       ...   e
			 * 
			 */
			
			
			BinaryTreeNode<D> b,e,parent;
			
			// Set all variables
			b = a.getRight();
			if(a != this.getRoot())
				parent = a.getParentNode();
			else
				parent = null;
			if(a.getRight() != null && a.getRight().getLeft() != null)
				e = a.getRight().getLeft();
			else
				e = null;
			
			if(parent != null){
				if(parent.getRight() == a)
					parent.setRight(b);
				else
					parent.setLeft(b);
			}else{ // handle root
				this.setRoot(b);
				b.setParentNode(null);
			}
			
			if(b != null)
				b.setLeft(a);
			a.setRight(e);
			
			// Set depth
			/*a.setDepth(a.getDepth()-1);
			b.setDepth(b.getDepth()+1);*/
			
			// decrease the depth of left children of b
			BinaryTree<D> btree = new BinaryTree<D>();
			if(b != null){
				btree.setRoot(b.getRight());
				for (BinaryTreeNode<D> binaryTreeNode : btree)
					binaryTreeNode.setDepth(binaryTreeNode.getDepth() + 1);
			}
			
			// increase the depht of right chlidren of a
			btree.setRoot(a.getLeft());
			for (BinaryTreeNode<D> binaryTreeNode : btree)
				binaryTreeNode.setDepth(binaryTreeNode.getDepth() - 1);
		}
	}
}
