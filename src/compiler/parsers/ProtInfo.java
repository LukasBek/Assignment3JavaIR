package compiler.parsers;

public class ProtInfo {

	Length length;
	ProtName protName;
	
	public ProtInfo(Length length, ProtName protName){
		this.length = length;
		this.protName = protName;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}

	public ProtName getProtName() {
		return protName;
	}

	public void setProtName(ProtName protName) {
		this.protName = protName;
	}
}
