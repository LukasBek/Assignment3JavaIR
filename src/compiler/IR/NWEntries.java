package compiler.IR;

import java.util.LinkedList;

public class NWEntries {
	
	private LinkedList<NWEntry> entries;
	
//	entry : date time packet;
	
	public NWEntries(){
		
	}
	
	public NWEntries(LinkedList<NWEntry> ent) {
		this.entries = ent;
	}

	public LinkedList<NWEntry> getEntry() {
		return entries;
	}



}
