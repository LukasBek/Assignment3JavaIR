package compiler.Phases;

import java.io.PrintStream;

import compiler.IR.*;

public class PrettyPrint {
	 
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
	
	public Integer NWEntries(NWEntries e){
		
		for (NWEntry c : e.getEntry()){
			visitEntry(c);
		}
		return null;
	}

	private void visitEntry(NWEntry e) {
		
		
		
	}
}
