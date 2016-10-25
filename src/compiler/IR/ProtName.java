package compiler.IR;

public class ProtName extends IR {

	String name;
	
	public ProtName(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
