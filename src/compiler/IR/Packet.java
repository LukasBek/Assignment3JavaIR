package compiler.IR;

public class Packet extends IR {
	
	
	// packet : mac '>' mac ',' 'ethertype' type ',' length ':' ipv4content;
	
	private Mac mac1;
	private Mac mac2;
	private Type type;
	private Length length;
	private Ipv4Content ipv4Content;
	
	private String str = "ethernet";
	
	public Packet (Mac mac1, Mac mac2, Type type, Length length, Ipv4Content ipv4Content) {
		this.mac1 = mac1;
		this.mac2 = mac2;
		this.type = type;
		this.length = length;
		this.ipv4Content = ipv4Content;
		
	}

	public Mac getMac1() {
		return mac1;
	}

	public void setMac1(Mac mac1) {
		this.mac1 = mac1;
	}

	public Mac getMac2() {
		return mac2;
	}

	public void setMac2(Mac mac2) {
		this.mac2 = mac2;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}

	public Ipv4Content getIpv4Content() {
		return ipv4Content;
	}

	public void setIpv4Content(Ipv4Content ipv4Content) {
		this.ipv4Content = ipv4Content;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	

}
