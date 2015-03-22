package fr.utbm.gl52.tree;

import java.lang.ref.WeakReference;

/**
 * Define a tree node which can not be instantiated.
 * Default method of a tree node.
 *
 * @author aguyon
 *
 */
public abstract class AbstractTreeNode <D,N extends TreeNode<D,N>> implements TreeNode<D, N>{

	private static final long serialVersionUID = 6582542242535421478L;

	/**
	 * Reference to its parent. (WeakReference for not troubling the garbage collector with loop in object's references)
	 */
	private transient WeakReference<N> parent = null;
	
	/**
	 * The data to store
	 */
	private D userData;

	@Override
	public N getParentNode() {
		return this.parent.get();
	}

	@Override
	public void setParentNode(N parent) {
		this.parent = new WeakReference<N>(parent);
	}
	
	public boolean hasParentNode(){
		return (this.parent != null);
	}

	@Override
	public D getUserData() {
		return this.userData;
	}

	@Override
	public void setUserData(D userData) {
		this.userData = userData;
	}

}
