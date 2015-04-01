/**
 * 
 */
package fr.utbm.gl52.tree;

import java.util.Iterator;

import fr.utbm.gl52.collections.ArrayStack;


/**
 * This class implements a binary tree. It have BinaryTreeNode(s)
 *
 * @author Alexandre Guyon
 * @param <D> 
 *
 */
public class BinaryTree<D> extends AbstractTree<D, BinaryTreeNode<D>> {

	private static final long serialVersionUID = -4003269397755168711L;
	
	/**
	 * Allows to iterate over Binary Trees in left first preorder.
	 * 
	 * @author Alexandre Guyon
	 *
	 */
	class leftFirstPreorderIterationIterator implements Iterator<BinaryTreeNode<D>>{

		private final ArrayStack<BinaryTreeNode<D>> stack;
		
		/**
		 * Construct Iterator
		 */
		public leftFirstPreorderIterationIterator(){
			this.stack = new ArrayStack<>();
			pushLeftChildren(getRoot());
		}
		
		/**
		 * Push all left children of the node cur
		 * @param cur
		 */
		private void pushLeftChildren(BinaryTreeNode<D> cur) {
		    BinaryTreeNode<D> c = cur;
		    while (c != null) {  
			this.stack.push(c);
			c = c.getLeft();  
		    }  
		}

		@Override
		public boolean hasNext() {
			return !this.stack.isEmpty();
		}

		@Override
		public BinaryTreeNode<D> next() {
			BinaryTreeNode<D> res = this.stack.pop();  
		    pushLeftChildren(res.getRight());  
		   
		     return res;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
		}
	}
	
	@Override
	public Iterator<BinaryTreeNode<D>> iterator(){
		return new leftFirstPreorderIterationIterator();
	}
}
