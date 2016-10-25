package compiler.IR;

public class Ipv4Proto extends IR {

	ProtName protName;
	int number;
	
	public Ipv4Proto(ProtName protName, int number){
		this.protName = protName;
		this.number = number;
	}

	public ProtName getProtName() {
		return protName;
	}

	public void setProtName(ProtName protName) {
		this.protName = protName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
