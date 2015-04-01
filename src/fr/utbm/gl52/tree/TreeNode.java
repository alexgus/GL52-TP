/**
 * 
 */
package fr.utbm.gl52.tree;

import java.io.Serializable;

/**
 * Interface to control and access to a tree node.
 * 
 * @author Alexandre Guyon
 * @param <D> 
 * @param <N> 
 *
 */
public interface TreeNode <D,N extends TreeNode<D,N>> extends Serializable {

	/**
	 * Get the parent node of this one
	 * @return 
	 */
	public N getParentNode();
	
	/**
	 * Set the parent node of this current node.
	 * @param parent 
	 */
	public void setParentNode(N parent);
	
	/**
	 * Test if this nade has parent node
	 * @return 
	 */
	public boolean hasParentNode();
	
	/**
	 * Count how many child this node has.
	 * @return 
	 */
	public Integer getChildCount();
	
	/**
	 * Get the data stored in the node
	 * @return 
	 */
	public D getUserData();
	
	/**
	 * Set the data stored in this node.
	 * @param userData 
	 */
	public void setUserData(D userData);
}
