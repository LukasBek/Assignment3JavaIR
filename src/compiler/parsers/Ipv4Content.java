package compiler.parsers;

public class Ipv4Content {
	
	Ipv4Fields ipv4Fields;
	Ipv4ADR adress1, adress2;
	ProtInfo protInfo;
	DumpLine dumpLine;
	
	public Ipv4Content(Ipv4Fields ipv4Fields, Ipv4ADR adress1, Ipv4ADR adress2, ProtInfo protInfo, DumpLine dumpLine){
		this.ipv4Fields = ipv4Fields;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.protInfo = protInfo;
		this.dumpLine = dumpLine;
	}

	public Ipv4Fields getIpv4Fields() {
		return ipv4Fields;
	}

	public void setIpv4Fields(Ipv4Fields ipv4Fields) {
		this.ipv4Fields = ipv4Fields;
	}

	public Ipv4ADR getAdress1() {
		return adress1;
	}

	public void setAdress1(Ipv4ADR adress1) {
		this.adress1 = adress1;
	}

	public Ipv4ADR getAdress2() {
		return adress2;
	}

	public void setAdress2(Ipv4ADR adress2) {
		this.adress2 = adress2;
	}

	public ProtInfo getProtInfo() {
		return protInfo;
	}

	public void setProtInfo(ProtInfo protInfo) {
		this.protInfo = protInfo;
	}

	public DumpLine getDumpLine() {
		return dumpLine;
	}

	public void setDumpLine(DumpLine dumpLine) {
		this.dumpLine = dumpLine;
	}

}
