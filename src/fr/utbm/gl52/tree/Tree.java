package fr.utbm.gl52.tree;

import java.io.Serializable;
import java.util.Iterator;


/**
 * Interface to control a tree.
 * 
 * @author Alexandre Guyon
 * @param <D> 
 * @param <N> 
 *
 */
public interface Tree<D,N extends TreeNode<D,N>> extends Iterable<N>, Serializable {
	
	/**
	 * Get The root TreeNode of this tree
	 * @return 
	 */
	public N getRoot();
	
	/**
	 * Set the root tree node of this tree
	 * @param el 
	 */
	public void setRoot(N el);
	
	/**
	 * Return true if this tree is empty, false otherwise.
	 * @return 
	 */
	public boolean isEmpty(); 

	@Override
	public Iterator<N> iterator();
}
