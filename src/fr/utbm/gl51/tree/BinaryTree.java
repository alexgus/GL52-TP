/**
 * 
 */
package fr.utbm.gl51.tree;

import java.util.Iterator;


/**
 * This class implements a binary tree. It have BinaryTreeNode(s)
 *
 * @author aguyon
 *
 */
public class BinaryTree<D> extends AbstractTree<D, BinaryTreeNode<D>> {

	private static final long serialVersionUID = -4003269397755168711L;
	
	class leftFirstPreorderIterationIterator implements Iterator<BinaryTreeNode<D>>{

		private BinaryTreeNode<D> curIndex;
		
		public leftFirstPreorderIterationIterator(){
			this.curIndex = getRoot();
			this.setToLeft();
		}
		
		/**
		 * Set the current to deep left
		 */
		private void setToLeft(){
			while(this.curIndex.hasLeftChild())
				this.curIndex = this.curIndex.getLeft();
		}
		
		@Override
		public boolean hasNext() {
			if(this.curIndex.hasLeftChild() 
					|| this.curIndex.hasParentNode() 
					|| this.curIndex.hasRightChild())
				return true;
			return false;
		}

		@Override
		public BinaryTreeNode<D> next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public leftFirstPreorderIterationIterator getIterator(){
		return new leftFirstPreorderIterationIterator();
	}
}
