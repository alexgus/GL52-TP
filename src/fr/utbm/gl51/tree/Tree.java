package fr.utbm.gl51.tree;

import java.io.Serializable;


/**
 * Interface to control a tree.
 * 
 * @author aguyon
 *
 */
public interface Tree<D,N extends TreeNode<D,N>> extends Iterable<N>, Serializable {
	
	/**
	 * Get The root TreeNode of this tree
	 */
	public N getRoot();
	
	/**
	 * Set the root tree node of this tree
	 */
	public void setRoot(N el);
	
	/**
	 * Return true if this tree is empty, false otherwise.
	 */
	public boolean isEmpty(); 

	// TODO iterator
}
