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
            this.stack.push(getRoot());
		}
		
		public leftFirstPreorderIterationIterator(BinaryTreeNode<D> node){
			this.stack = new ArrayStack<BinaryTreeNode<D>>();
            this.stack.push(node);
		}
		
		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public BinaryTreeNode<D> next() {
            BinaryTreeNode<D> node = stack.pop();           

            if (node.hasRightChild()) 
            	stack.push(node.getRight());
            if (node.hasLeftChild()) 
            	stack.push(node.getLeft());

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
