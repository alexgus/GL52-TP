package fr.utbm.gl52.collections.listsorter;

import java.util.List;

public interface ListSorter {

    public <D extends Comparable<D>> List<D> ascendingSort(List<D> unsorted);
    
    public <D extends Comparable<D>> List<D> descendingSort(List<D> unsorted);
    
}
