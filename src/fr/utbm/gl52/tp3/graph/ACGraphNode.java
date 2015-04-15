package fr.utbm.gl52.tp3.graph;

import java.util.LinkedHashSet;
import java.util.Set;

public class ACGraphNode<D> implements GraphNode<D, ACGraphNode<D>> {

    private D data;

    private Set<ACGraphNode<D>> succ;

    private Set<ACGraphNode<D>> prec;
    
    /*@Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((data == null) ? 0 : data.hashCode());
	result = prime * result + ((prec == null) ? 0 : prec.hashCode());
	result = prime * result + ((succ == null) ? 0 : succ.hashCode());
	return result;
    }*/

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ACGraphNode other = (ACGraphNode) obj;
	if (data == null) {
	    if (other.data != null)
		return false;
	} else if (!data.equals(other.data))
	    return false;
	if (prec == null) {
	    if (other.prec != null)
		return false;
	} else if (!prec.equals(other.prec))
	    return false;
	if (succ == null) {
	    if (other.succ != null)
		return false;
	} else if (!succ.equals(other.succ))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "ACGraphNode [data=" + data + "]";
    }
    
    public ACGraphNode(D data) {
	super();
	
	this.data = data;
	
	this.succ = new LinkedHashSet<>();
	this.prec = new LinkedHashSet<>();
    }

    @Override
    public void addSuccessor(ACGraphNode<D> succ) {
	this.succ.add(succ);
    }

    @Override
    public void removeSuccessor(ACGraphNode<D> succ) {
	this.succ.remove(succ);
    }

    @Override
    public void addAllSuccessors(Set<ACGraphNode<D>> succs) {
	this.succ.addAll(succs);
    }

    @Override
    public void RemoveAllSuccessors(Set<ACGraphNode<D>> succs) {
	this.succ.removeAll(succs);
    }

    @Override
    public boolean hasSuccessor() {
	return (!this.succ.isEmpty());
    }

    @Override
    public void addPredecesseur(ACGraphNode<D> prec) {
	this.prec.add(prec);
    }

    @Override
    public void removePredecesseur(ACGraphNode<D> prec) {
	this.prec.remove(prec);
    }

    @Override
    public void addAllPredecesseur(Set<ACGraphNode<D>> prec) {
	this.prec.addAll(prec);
    }

    @Override
    public void RemoveAllPredecesseur(Set<ACGraphNode<D>> prec) {
	this.prec.removeAll(prec);
    }

    @Override
    public boolean hasPredecesseur() {
	return (!this.prec.isEmpty());
    }
    
    @Override
    public D getData() {
	return this.data;
    }
    
    public Set<ACGraphNode<D>> getSucc() {
        return succ;
    }

    public void setSucc(Set<ACGraphNode<D>> succ) {
        this.succ = succ;
    }

    public Set<ACGraphNode<D>> getPrec() {
        return prec;
    }

    public void setPrec(Set<ACGraphNode<D>> prec) {
        this.prec = prec;
    }

}
