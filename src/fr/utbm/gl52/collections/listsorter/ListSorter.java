package fr.utbm.gl52.collections.listsorter;

import java.util.List;

/**
 * This interface defines ascending and descending sorts.
 * 
 * @author Alexandre Guyon
 *
 */
public interface ListSorter {

    /**
     * Allows ascend sort a list
     * @param unsorted The unsorted list
     * @return Return ascending sorted list
     */
    public <D extends Comparable<D>> List<D> ascendingSort(List<D> unsorted);
    
    /**
     * Allows to descend sort a list
     * @param unsorted The unsorted list
     * @return Return descending sorted list
     */
    public <D extends Comparable<D>> List<D> descendingSort(List<D> unsorted);
    
}
