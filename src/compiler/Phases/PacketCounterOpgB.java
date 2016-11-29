package compiler.Phases;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import compiler.IR.*;
import support.IRElementVisitor;
import support.VisitorException;

public class PacketCounterOpgB extends IRElementVisitor<Integer> {
	
	private ArrayList<IpToIp> ips = new ArrayList<IpToIp>();
	 
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
			visitEntry(c);
		}
		
		return null;
	}

	@Override
	public Integer visitEntry(NWEntry e) throws VisitorException {

		visitTime(e.getTime());
		visitDate(e.getDate());
		visitPacket(e.getPacket());
		
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
		
//		ips.add(adr1 +"->"+ adr2);
		IpToIp ipToIpNew = new IpToIp(e.getAdress1(), e.getAdress2(), 1);
		if (ips)
		ips.add(new IpToIp(e.getAdress1(), e.getAdress2(), count))
		
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
		//hehe
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
			new PacketCounterOpgB().visitEntries(ir.e); 
		} catch (VisitorException e1) {
			e1.printStackTrace();
		}
	}
	
	private class IpToIp {
		Ipv4ADR ipv4adr1;
		Ipv4ADR ipv4adr2;
		int count = 0;
		
		public IpToIp(Ipv4ADR ipv4adr1, Ipv4ADR ipv4adr2, int count) {
			this.ipv4adr1 = ipv4adr1;
			this.ipv4adr2 = ipv4adr2;
			this.count = count;
		}
		
	}
	
}
