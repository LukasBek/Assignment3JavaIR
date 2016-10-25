package compiler.IR;

public class Length extends IR {

	int number;
	
	public Length(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
