package compiler.Phases;

import java.io.PrintStream;

import compiler.IR.*;
import support.IRElementVisitor;
import support.VisitorException;

public class PrettyPrint extends IRElementVisitor<Integer> {
	 
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitEntry(NWEntry e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitDate(Date e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitTime(Time e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitPacket(Packet e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4conten(Ipv4Content e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4ttl(Ipv4Ttl e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4flags(Ipv4Flags e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitDumpline(DumpLine e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitLength(Length e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitType(Type e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4id(Ipv4Id e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitMac(Mac e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4offset(Ipv4Offset e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitProtinfo(ProtInfo e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4proto(Ipv4Proto e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4(Ipv4 e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitFlagvalues(FlagValues e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4tos(Ipv4Tos e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitProtname(ProtName e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4fields(Ipv4Fields e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitTag(Tag e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}
}
