package compiler.IR;

public class DumpLine extends IR {

	Hex hex;
	String string;
	
	public DumpLine(Hex hex, String string){
		this.hex = hex;
		this.string = string;
	}
}
