package compiler.IR;

public class Tag extends IR {

	Hex hex;
	
	public Tag(Hex hex){
		this.hex = hex;
	}

	public Hex getHex() {
		return hex;
	}

	public void setHex(Hex hex) {
		this.hex = hex;
	}
}
