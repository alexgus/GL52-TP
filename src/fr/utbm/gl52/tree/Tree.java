package fr.utbm.gl52.tree;

import java.io.Serializable;
import java.util.Iterator;


/**
 * Interface to control a tree.
 * 
 * @author Alexandre Guyon
 * @param <D> The type of data to store in the abstract tree
 * @param <N> The type of node it has
 *
 */
public interface Tree<D,N extends TreeNode<D,N>> extends Iterable<N>, Serializable {
	
	/**
	 * Get The root TreeNode of this tree
	 * @return The root node of this tree
	 */
	public N getRoot();
	
	/**
	 * Set the root tree node of this tree
	 * @param el the root node to set
	 */
	public void setRoot(N el);
	
	/**
	 * Return true if this tree is empty, false otherwise.
	 * @return (boolean) true if the tree is empty, false otherwise
	 */
	public boolean isEmpty(); 

	@Override
	public Iterator<N> iterator();
}
