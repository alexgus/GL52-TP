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
			if(getRoot() != null)
				this.stack.push(getRoot());
		}
		
		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public BinaryTreeNode<D> next() {
            BinaryTreeNode<D> node = stack.pop();         
            BinaryTreeNode<D> test;
            if (node.hasRightChild() && (test = node.getRight()) != null ) 
            	stack.push(test);
            if (node.hasLeftChild() && (test = node.getLeft()) != null) 
            	stack.push(test);

            return node;
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
