/**
 * 
 */
package fr.utbm.gl52.tree;

import java.io.Serializable;

/**
 * Interface to control and access to a tree node.
 * 
 * @author Alexandre Guyon
 * @param <D> The type of data to store in the abstract tree
 * @param <N> The type of node it has
 *
 */
public interface TreeNode <D,N extends TreeNode<D,N>> extends Serializable {

	/**
	 * Get the parent node of this one
	 * @return The parent node of this current node
	 */
	public N getParentNode();
	
	/**
	 * Set the parent node of this current node.
	 * @param parent The parent node to set
	 */
	public void setParentNode(N parent);
	
	/**
	 * Test if this node has parent node
	 * @return (boolean) true if this node has parent, false otherwise
	 */
	public boolean hasParentNode();
	
	/**
	 * Count how many child this node has.
	 * @return Get the number of child, the node has
	 */
	public Integer getChildCount();
	
	/**
	 * Get the data stored in the node
	 * @return The generic data stored
	 */
	public D getUserData();
	
	/**
	 * Set the data stored in this node.
	 * @param userData The data to store in the node
	 */
	public void setUserData(D userData);
}
