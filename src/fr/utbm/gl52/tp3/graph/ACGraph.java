package fr.utbm.gl52.tp3.graph;

import java.util.LinkedHashSet;
import java.util.Set;

public class ACGraph<D> implements Graph<D, ACGraphNode<D>> {

    private Set<ACGraphNode<D>> roots;
    
    public ACGraph() {
	super();
	this.roots = new LinkedHashSet<>();
    }

    @Override
    public boolean addRoot(ACGraphNode<D> e) {
	return this.roots.add(e);
    }

    @Override
    public boolean addAllRoots(Set<ACGraphNode<D>> c) {
	return this.roots.addAll(c);
    }

    @Override
    public boolean isEmpty() {
	return this.roots.isEmpty();
    }

    @Override
    public boolean removeRoot(ACGraphNode<D> o) {
	Set<ACGraphNode<D>> succ = o.getSucc();
	for (ACGraphNode<D> acGraphNode : succ) {
	    acGraphNode.removePredecesseur(o);
	    if(!acGraphNode.hasPredecesseur())
		this.addRoot(acGraphNode);
	}
	return this.roots.remove(o);
    }

    @Override
    public boolean removeAllRoots(Set<ACGraphNode<D>> c) {
	return this.roots.removeAll(c);
    }

    @Override
    public Set<ACGraphNode<D>> getRoots() {
	return this.roots;
    }
    
    
}
