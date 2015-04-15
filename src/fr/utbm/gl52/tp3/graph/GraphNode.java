package fr.utbm.gl52.tp3.graph;

import java.util.Set;

public interface GraphNode<D extends Object, N extends GraphNode<D,N>> {
    
    public void addSuccessor(N succ);
    
    public void removeSuccessor(N succ);
    
    public void addAllSuccessors(Set<N> succs);
    
    public void RemoveAllSuccessors(Set<N> succs);
 
    public boolean hasSuccessor();
    
    public void addPredecesseur(N prec);
    
    public void removePredecesseur(N prec);
    
    public void addAllPredecesseur(Set<N> prec);
    
    public void RemoveAllPredecesseur(Set<N> prec);
 
    public boolean hasPredecesseur();
    
    public D getData();
    
}
