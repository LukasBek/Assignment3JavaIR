package compiler.IR;

public class Ipv4Tos extends IR {
	
	Hex hex;
	
	public Ipv4Tos(Hex hex){
		this.hex = hex;
	}

	public Hex getHex() {
		return hex;
	}

	public void setHex(Hex hex) {
		this.hex = hex;
	}

}
