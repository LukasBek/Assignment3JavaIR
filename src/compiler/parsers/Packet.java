package compiler.parsers;

public class Packet {
	
	
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
	

}
