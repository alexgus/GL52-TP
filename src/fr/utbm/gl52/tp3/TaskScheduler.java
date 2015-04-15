package fr.utbm.gl52.tp3;

import java.util.List;
import java.util.Set;

import fr.utbm.gl52.tp3.graph.ACGraph;
import fr.utbm.gl52.tp3.graph.ACGraphNode;

public class TaskScheduler {

    public static List<Task> linearize(ACGraph<Task> gTask){
	Set<ACGraphNode<Task>> rs = gTask.getRoots();
	while(!gTask.isEmpty()) {
	    ACGraphNode<Task> t = null;
	    for (ACGraphNode<Task> root : rs) {
		t = root;
	    }
	    System.out.println(t);
	    gTask.removeRoot(t);
	}
	return null;
    }
    
}
