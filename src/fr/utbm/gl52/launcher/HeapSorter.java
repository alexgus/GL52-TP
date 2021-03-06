/**
 * 
 */
package fr.utbm.gl52.launcher;

import java.util.LinkedList;
import java.util.List;

import fr.utbm.gl52.collections.listsorter.HeapListSorter;

/**
 * Allow to test the heapsort
 * 
 * @author Alexandre Guyon
 *
 */
public class HeapSorter {

    /**
     * The main takes no arguments. Just display the sorted list (ascend and descend list)
     * @param args no args
     */
    public static void main(String[] args) {
	List<Integer> l = new LinkedList<>();
	
	l.add(1);
	l.add(543);
	l.add(11);
	l.add(42);
	l.add(56);
	l.add(456);
	l.add(8);
	l.add(4);

	HeapListSorter h = new HeapListSorter();
	
	System.out.println("Ascending : " + h.ascendingSort(l));
	System.out.println("Descending : " + h.descendingSort(l));
    }

}
