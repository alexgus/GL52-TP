package fr.utbm.gl52.tp3.graph;

import java.util.Set;

public interface Graph <D, N extends GraphNode<D,N>> {

    public boolean isEmpty();
    
    public boolean addRoot(N root);
    
    public boolean removeRoot(N root);
    
    public boolean addAllRoots(Set<N> roots);
    
    public boolean removeAllRoots(Set<N> roots);
    
    public Set<N> getRoots();
    
}
