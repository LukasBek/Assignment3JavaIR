package compiler.IR;

public class Hex extends IR {
	
	private String string;

	public Hex(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}


}
