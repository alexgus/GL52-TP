/**
 * 
 */
package fr.utbm.gl52.tree;

import java.util.Iterator;

import fr.utbm.gl52.collections.ArrayStack;


/**
 * This class implements a binary tree. It have BinaryTreeNode(s)
 *
 * @author aguyon
 *
 */
public class BinaryTree<D> extends AbstractTree<D, BinaryTreeNode<D>> {

	private static final long serialVersionUID = -4003269397755168711L;
	
	class leftFirstPreorderIterationIterator implements Iterator<BinaryTreeNode<D>>{

		private final ArrayStack<BinaryTreeNode<D>> stack;
		
		public leftFirstPreorderIterationIterator(){
			this.stack = new ArrayStack<BinaryTreeNode<D>>();
			pushLeftChildren(getRoot());
		}
		
		private void pushLeftChildren(BinaryTreeNode<D> cur) {  
	     while (cur != null) {  
	       stack.push(cur);
	       cur = cur.getLeft();  
	     }  
	   }
		
		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public BinaryTreeNode<D> next() {
			BinaryTreeNode<D> res = stack.pop();  
		    pushLeftChildren(res.getRight());  
		   
		     return res;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public Iterator<BinaryTreeNode<D>> iterator(){
		return new leftFirstPreorderIterationIterator();
	}
}
