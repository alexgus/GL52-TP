/**
 * 
 */
package fr.utbm.gl52.tree;

import java.util.Iterator;

/**
 * @author aguyon
 *
 */
public abstract class AbstractTree<D,N extends AbstractTreeNode<D,N>> implements Tree<D,N> {

	private N root;
	
	private static final long serialVersionUID = -7402586842503600587L;

	@Override
	public N getRoot() {
		return this.root;
	}

	@Override
	public void setRoot(N el) {
		this.root = el;
	}

	@Override
	public boolean isEmpty() {
		if(this.root != null)
			return false;
		return true;
	}

	@Override
	public Iterator<N> iterator() {
		// TODO Iterator
		return null;
	}
}
