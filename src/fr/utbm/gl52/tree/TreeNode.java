/**
 * 
 */
package fr.utbm.gl52.tree;

import java.io.Serializable;

/**
 * Interface to control and access to a tree node.
 * 
 * @author aguyon
 *
 */
public interface TreeNode <D,N extends TreeNode<D,N>> extends Serializable {

	/**
	 * Get the parent node of this one
	 */
	public N getParentNode();
	
	/**
	 * Set the parent node of this current node.
	 */
	public void setParentNode(N parent);
	
	/**
	 * Test if this nade has parent node
	 */
	public boolean hasParentNode();
	
	/**
	 * Count how many child this node has.
	 */
	public Integer getChildCount();
	
	/**
	 * Get the data stored in the node
	 */
	public D getUserData();
	
	/**
	 * Set the data stored in this node.
	 */
	public void setUserData(D userData);
}
