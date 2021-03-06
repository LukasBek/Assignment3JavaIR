package compiler.Phases;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import compiler.IR.*;
import exceptions.IntrusionException;
import support.IRElementVisitor;
import support.VisitorException;

public class IntrusionDetectionOpgC_ extends IRElementVisitor<Integer> {

	private ArrayList<MacIp> ips = new ArrayList<MacIp>();
	private MacIp macIp1 = new MacIp(null, null); 
	private MacIp macIp2 = new MacIp(null, null); 
	Mac mac1;
	Mac mac2;
	Ipv4ADR ipv4adr1;
	Ipv4ADR ipv4adr2;



	private class PrettyPrinter {

		private PrintStream ps;
		private int indent=0;
		private int width=2;
		private boolean isindented = false;

		public PrettyPrinter() {
			this(System.out);
		}

		public PrettyPrinter(PrintStream ps) {
			this.ps = ps;
		}

		public void in() {
			indent+=width;
		}

		public void out() {
			indent-=width;
			if (indent<0) {
				indent=0;
			}
		}

		private void indent() {
			if (isindented) return;
			for (int i=0;i<this.indent;i++) ps.print(' ');
			isindented=true;
		}

		public void println(String s) {
			this.indent();
			ps.println(s);
			isindented=false;
		}

		public void print(String s) {
			this.indent();
			ps.print(s);
		}
	}

	private PrettyPrinter pp = new PrettyPrinter();

	//	public Integer NWEntries(NWEntries e){
	//		
	//		for (NWEntry c : e.getEntry()){
	//			visitEntry(c);
	//		}
	//		return null;
	//	}
	//
	//	private void visitEntry(NWEntry e) {
	//		
	//		
	//		
	//	}


	@Override
	public Integer visitEntries(compiler.IR.NWEntries e) throws VisitorException {

		for (NWEntry c : e.getEntry() ) {
			try {
				visitEntry(c);
			} catch (IntrusionException e1) {
				e1.printStackTrace();
			}
		}



		return null;
	}

	@Override
	public Integer visitEntry(NWEntry e) throws VisitorException, IntrusionException {

		visitTime(e.getTime());
		visitDate(e.getDate());
		visitPacket(e.getPacket());

		macIp1 = new MacIp(mac1, ipv4adr1);
		macIp2 = new MacIp(mac2, ipv4adr2);

		//Her tjekkes om ip1 har ændret sin mac adresse:
		for (int i = 0; i < ips.size(); i++) {
			if (macIp1.getIpv4adr().equals(ips.get(i).getIpv4adr())) {
				if (!(macIp1.getMac().equals(ips.get(i).mac))) {
					throw new IntrusionException("Ikke samme mac adresse!" + macIp1.getIpv4adr());
				}
			}
		}
		//Her tjekkes om ip2 har ændret sin mac adresse:
		for (int i = 0; i < ips.size(); i++) {
			if (macIp2.getIpv4adr().equals(ips.get(i).getIpv4adr())) {
				if (!(macIp2.getMac().equals(ips.get(i).mac))) {
					throw new IntrusionException("Ikke samme mac adresse!" + macIp2.getIpv4adr());
				}
			}
		}
		
		//Her tjekkes om en mac adresse har en ny IP:
				for (int i = 0; i < ips.size(); i++) {
					if (macIp1.getMac().equals(ips.get(i).getMac())) {
						if (!(macIp1.getIpv4adr().equals(ips.get(i).ipv4adr))) {
							throw new IntrusionException("Ikke samme IP adresse!" + macIp1.getMac());
						}
					}
				}

		//Her tjekkes om en mac adresse har en ny IP:
		for (int i = 0; i < ips.size(); i++) {
			if (macIp2.getMac().equals(ips.get(i).getMac())) {
				if (!(macIp2.getIpv4adr().equals(ips.get(i).ipv4adr))) {
					throw new IntrusionException("Ikke samme IP adresse!" + macIp2.getMac());
				}
			}
		}

		ips.add(macIp1);
		ips.add(macIp2);

		return null;
	}

	@Override
	public Integer visitDate(Date e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitTime(Time e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitPacket(Packet e) throws VisitorException {

		mac1 = e.getMac1();
		mac2 = e.getMac2();

		visitMac(e.getMac1());
		visitMac(e.getMac2());
		visitType(e.getType());
		visitLength(e.getLength());
		visitIpv4conten(e.getIpv4Content());
		return null;
	}

	@Override
	public Integer visitIpv4conten(Ipv4Content e) throws VisitorException {
		visitIpv4fields(e.getIpv4Fields());
		ipv4adr1 = e.getAdress1();
		ipv4adr2 = e.getAdress2();


		return null;
	}

	@Override
	public Integer visitIpv4ttl(Ipv4Ttl e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitIpv4flags(Ipv4Flags e) throws VisitorException {
		visitFlagvalues(e.getfV());
		return null;
	}

	@Override
	public Integer visitDumpline(DumpLine e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitLength(Length e) throws VisitorException {
		visitLength(e);
		return null;
	}

	@Override
	public Integer visitType(Type e) throws VisitorException {
		visitIpv4(e.getIpv4());
		return null;
	}

	@Override
	public Integer visitIpv4id(Ipv4Id e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitMac(Mac e) throws VisitorException {



		return null;
	}

	@Override
	public Integer visitIpv4offset(Ipv4Offset e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitProtinfo(ProtInfo e) throws VisitorException {
		visitLength(e.getLength());
		visitProtname(e.getProtName());
		return null;
	}

	@Override
	public Integer visitIpv4proto(Ipv4Proto e) throws VisitorException {
		visitProtname(e.getProtName());
		return null;
	}

	@Override
	public Integer visitIpv4(Ipv4 e) throws VisitorException {
		visitTag(e.getTag());
		return null;
	}

	@Override
	public Integer visitFlagvalues(FlagValues e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitIpv4tos(Ipv4Tos e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitProtname(ProtName e) throws VisitorException {
		return null;
	}

	@Override
	public Integer visitIpv4fields(Ipv4Fields e) throws VisitorException {
		visitIpv4tos(e.getIpv4Tos());
		visitIpv4ttl(e.getIpv4Ttl());
		visitIpv4id(e.getIpv4Id());
		visitIpv4offset(e.getIpv4Offset());
		visitIpv4flags(e.getIpv4Flags());
		visitIpv4proto(e.getIpv4Proto());
		visitLength(e.getLength());

		return null;
	}

	@Override
	public Integer visitTag(Tag e) throws VisitorException {
		return null;
	}

	public static void print(IR ir) {
		try {
			new IntrusionDetectionOpgC_().visitEntries(ir.e); 
		} catch (VisitorException e1) {
			e1.printStackTrace();
		}
	}

	private class MacIp {
		Mac mac;
		Ipv4ADR ipv4adr;

		public MacIp(Mac mac, Ipv4ADR ipv4adr) {
			this.mac = mac;
			this.ipv4adr = ipv4adr;
		}

		public Mac getMac() {
			return mac;
		}

		public void setMac(Mac mac) {
			this.mac = mac;
		}

		public Ipv4ADR getIpv4adr() {
			return ipv4adr;
		}

		public void setIpv4adr(Ipv4ADR ipv4adr) {
			this.ipv4adr = ipv4adr;
		}
	}
}
