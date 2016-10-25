package compiler.IR;

public class Ipv4Id extends IR {

	int number;

	public Ipv4Id(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
