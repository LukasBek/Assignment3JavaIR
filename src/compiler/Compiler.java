package compiler;

import compiler.IR.IR;
import compiler.Phases.PrettyPrint;
import exceptions.CompilerException;
import exceptions.IRParserException;

public class Compiler {

	private String filename;
	
	public static void main(String[] args) {
		
		try {
			Compiler compiler = new Compiler(args[0]);
			
			IR ir = compiler.generateIR();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Compiler(String filename) throws CompilerException {
		this.filename = filename;
	}

	private IR generateIR() throws CompilerException {
		IR ir;
		try {
			System.out.println("Parsing");
			ir = IR.Build(this.filename);
			System.out.println("Parsing finish");
			System.out.println("PrettyPrinter:");
			PrettyPrint.print(ir.e);
		} catch (IRParserException e) {
			throw new CompilerException(e.getMessage());
		}
		return ir;
	}
}
