package compiler.IR;

public class Word {

	private Hex hex1, hex2, hex3, hex4;
	
	public Word(Hex hex1, Hex hex2, Hex hex3, Hex hex4){
		this.hex1 = hex1;
		this.hex2 = hex2;
		this.hex3 = hex3;
		this.hex4 = hex4;
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

	public Hex getHex3() {
		return hex3;
	}

	public void setHex3(Hex hex3) {
		this.hex3 = hex3;
	}

	public Hex getHex4() {
		return hex4;
	}

	public void setHex4(Hex hex4) {
		this.hex4 = hex4;
	}
}
