package fr.utbm.gl52.tp3;

import java.util.UUID;

public class Task {

    private String name;
    
    private UUID id;
    
    public Task(String name){
	this.name = name;
	this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
	return "Task [name=" + name + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 17;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Task other = (Task) obj;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }
    
}
