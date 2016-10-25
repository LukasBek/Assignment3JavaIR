package compiler.IR;

import java.util.LinkedList;

public class NWEntries {
	
	private LinkedList<Entry> entries;
	
//	entry : date time packet;
	
	public NWEntries(){
		
	}
	
	public NWEntries(LinkedList<Entry> ent) {
		this.entries = ent;
	}

	public LinkedList<Entry> getEntry() {
		return entries;
	}



}
