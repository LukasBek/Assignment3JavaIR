	package compiler.IR;

public class Ipv4Fields extends IR {

	Ipv4Tos ipv4Tos;
	Ipv4Ttl ipv4Ttl;
	Ipv4Id ipv4Id;
	Ipv4Offset ipv4Offset;
	Ipv4Flags ipv4Flags;
	Ipv4Proto ipv4Proto;
	Length length;
	
	public Ipv4Fields(Ipv4Tos ipv4Tos, Ipv4Ttl ipv4Ttl, Ipv4Id ipv4Id, Ipv4Offset ipv4Offset,
			Ipv4Flags ipv4Flags, Ipv4Proto ipv4Proto, Length length){
		this.ipv4Tos = ipv4Tos;
		this.ipv4Ttl = ipv4Ttl;
		this.ipv4Id = ipv4Id;
		this.ipv4Offset = ipv4Offset;
		this.ipv4Flags = ipv4Flags;
		this.ipv4Proto = ipv4Proto;
		this.length = length;
	}

	public Ipv4Tos getIpv4Tos() {
		return ipv4Tos;
	}

	public void setIpv4Tos(Ipv4Tos ipv4Tos) {
		this.ipv4Tos = ipv4Tos;
	}

	public Ipv4Ttl getIpv4Ttl() {
		return ipv4Ttl;
	}

	public void setIpv4Ttl(Ipv4Ttl ipv4Ttl) {
		this.ipv4Ttl = ipv4Ttl;
	}

	public Ipv4Id getIpv4Id() {
		return ipv4Id;
	}

	public void setIpv4Id(Ipv4Id ipv4Id) {
		this.ipv4Id = ipv4Id;
	}

	public Ipv4Offset getIpv4Offset() {
		return ipv4Offset;
	}

	public void setIpv4Offset(Ipv4Offset ipv4Offset) {
		this.ipv4Offset = ipv4Offset;
	}

	public Ipv4Flags getIpv4Flags() {
		return ipv4Flags;
	}

	public void setIpv4Flags(Ipv4Flags ipv4Flags) {
		this.ipv4Flags = ipv4Flags;
	}

	public Ipv4Proto getIpv4Proto() {
		return ipv4Proto;
	}

	public void setIpv4Proto(Ipv4Proto ipv4Proto) {
		this.ipv4Proto = ipv4Proto;
	}

	public Length getLength() {
		return length;
	}

	public void setLength(Length length) {
		this.length = length;
	}
}
