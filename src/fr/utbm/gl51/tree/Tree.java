package fr.utbm.gl51.tree;

import java.io.Serializable;
import java.util.Iterator;


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

	public Iterator<N> iterator();
}
