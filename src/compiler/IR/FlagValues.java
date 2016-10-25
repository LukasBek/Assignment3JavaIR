package compiler.IR;

public class FlagValues extends IR {

	String value;
	
	public FlagValues(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
