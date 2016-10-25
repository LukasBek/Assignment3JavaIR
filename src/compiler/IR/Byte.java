package compiler.IR;

public class Byte extends IR {
	
	private Hex hex1;
	private Hex hex2;
	
	public Byte(Hex hex1, Hex hex2) {
		this.hex1 = hex1;
		this.hex2 = hex2;
	}

	public Hex getHex1() {
		return hex1;
	}

	public void setHex1(Hex hex1) {
		this.hex1 = hex1;
	}

	public Hex getHex2() {
		return hex2;
	}

	public void setHex2(Hex hex2) {
		this.hex2 = hex2;
	}

}
