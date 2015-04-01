package fr.utbm.gl52.collections.listsorter;

import java.util.LinkedList;
import java.util.List;

import fr.utbm.gl52.tree.AVLTree;
import fr.utbm.gl52.tree.BinaryTreeNode;

/**
 * 
 * @author Alexandre Guyon
 *
 */
public class HeapListSorter implements ListSorter {

    @Override
    public <D extends Comparable<D>> List<D> ascendingSort(List<D> unsorted) {
	List<D> l = new LinkedList<>();
	AVLTree<D> avl = new AVLTree<>();
	
	for (D val : unsorted)
	    avl.insert(val);
	
	for (BinaryTreeNode<D> binaryTreeNode : avl)
	    l.add(binaryTreeNode.getUserData());
	
	return l;
    }

    @Override
    public <D extends Comparable<D>> List<D> descendingSort(List<D> unsorted) {
	LinkedList<D> l = new LinkedList<>();
	AVLTree<D> avl = new AVLTree<>();
	
	for (D val : unsorted)
	    avl.insert(val);
	
	for (BinaryTreeNode<D> binaryTreeNode : avl)
	    l.addFirst(binaryTreeNode.getUserData());
	
	return l;
    }

}
