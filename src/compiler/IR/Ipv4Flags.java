package compiler.IR;

public class Ipv4Flags extends IR {

	private FlagValues fV;
	
	public Ipv4Flags(FlagValues fV){
		this.fV = fV;
	}

	public FlagValues getfV() {
		return fV;
	}

	public void setfV(FlagValues fV) {
		this.fV = fV;
	}
}
