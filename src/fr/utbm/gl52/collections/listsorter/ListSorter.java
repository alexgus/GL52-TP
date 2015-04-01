package fr.utbm.gl52.collections.listsorter;

import java.util.List;

/**
 * @author Alexandre Guyon
 *
 */
public interface ListSorter {

    /**
     * @param unsorted
     * @return
     */
    public <D extends Comparable<D>> List<D> ascendingSort(List<D> unsorted);
    
    /**
     * @param unsorted
     * @return
     */
    public <D extends Comparable<D>> List<D> descendingSort(List<D> unsorted);
    
}
