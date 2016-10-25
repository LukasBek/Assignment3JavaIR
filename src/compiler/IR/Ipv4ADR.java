package compiler.IR;

public class Ipv4ADR extends IR {
	
	int octet1, octet2, octet3, octet4, port;
	
	public Ipv4ADR(int octet1, int octet2, int octet3, int octet4, int port){
		this.octet1 = octet1;
		this.octet2 = octet2;
		this.octet3 = octet3;
		this.octet4 = octet4;
		this.port = port;
	}

	public int getOctet1() {
		return octet1;
	}

	public void setOctet1(int octet1) {
		this.octet1 = octet1;
	}

	public int getOctet2() {
		return octet2;
	}

	public void setOctet2(int octet2) {
		this.octet2 = octet2;
	}

	public int getOctet3() {
		return octet3;
	}

	public void setOctet3(int octet3) {
		this.octet3 = octet3;
	}

	public int getOctet4() {
		return octet4;
	}

	public void setOctet4(int octet4) {
		this.octet4 = octet4;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
