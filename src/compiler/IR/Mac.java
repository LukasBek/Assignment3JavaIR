package compiler.IR;

public class Mac extends IR {
	
	private String address;
	
	public Mac (String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
