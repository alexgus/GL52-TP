package fr.utbm.gl52.tp3;

import fr.utbm.gl52.tp3.graph.ACGraph;
import fr.utbm.gl52.tp3.graph.ACGraphNode;

public class TP3 {

    public static void main(String[] main){
	
	ACGraphNode<Task> a = new ACGraphNode<Task>(new Task("a"));
	ACGraphNode<Task> b = new ACGraphNode<Task>(new Task("b"));
	ACGraphNode<Task> c = new ACGraphNode<Task>(new Task("c"));
	ACGraphNode<Task> d = new ACGraphNode<Task>(new Task("d"));
	ACGraphNode<Task> e = new ACGraphNode<Task>(new Task("e"));
	ACGraphNode<Task> f = new ACGraphNode<Task>(new Task("f"));
	ACGraphNode<Task> g = new ACGraphNode<Task>(new Task("g"));
	ACGraphNode<Task> h = new ACGraphNode<Task>(new Task("h"));
	ACGraphNode<Task> i = new ACGraphNode<Task>(new Task("i"));
	ACGraphNode<Task> j = new ACGraphNode<Task>(new Task("j"));
	
	a.addSuccessor(b);
	b.addPredecesseur(a);
	
	a.addSuccessor(c);
	c.addPredecesseur(a);
	
	c.addSuccessor(d);
	d.addPredecesseur(c);
	
	d.addSuccessor(h);
	h.addPredecesseur(d);
	
	e.addSuccessor(f);
	f.addPredecesseur(e);
	
	f.addSuccessor(d);
	d.addPredecesseur(f);
	
	f.addSuccessor(g);
	g.addPredecesseur(f);
	
	e.addSuccessor(i);
	i.addPredecesseur(e);
	
	i.addSuccessor(j);
	j.addPredecesseur(i);
	
	ACGraph<Task> graph = new ACGraph<>();
	graph.addRoot(a);
	graph.addRoot(e);
	
	TaskScheduler.linearize(graph);
	
	
    }
    
}
