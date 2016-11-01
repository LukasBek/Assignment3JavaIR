package compiler.IR;

import java.util.ArrayList;

public class DumpLine extends IR {

	ArrayList<Dump> array = new ArrayList<Dump>();

	public DumpLine(){
	
	}
	public void addDump(Dump dump){
		array.add(dump);
	}
}
