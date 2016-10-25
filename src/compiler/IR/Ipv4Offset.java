package compiler.IR;

public class Ipv4Offset extends IR {

	int number;
	
	public Ipv4Offset(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
