package compiler.IR;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import compiler.FRONTEND.Assignment4grammarLexer;
import compiler.FRONTEND.Assignment4grammarParser;
import exceptions.CompilerException;
import exceptions.IRParserException;

public class IR {
	
	public NWEntries e;
	
	public IR(){
		
	}
	
	public IR(NWEntries e) {
		this.e = e;
	}
	
	public static IR Build(String filename) throws CompilerException, IRParserException{
		ParseTree pt;
		try {
			CharStream input = ANTLRFileStream(filename);
			
			Assignment4grammarLexer lex = new Assignment4grammarLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lex);
			
			Assignment4grammarParser parser = new Assignment4grammarParser(tokens);
			
			pt = parser.entries();
			
			if (parser.getNumberOfSyntaxErrors() > 0) {
				throw new IRParserException("Error "+parser.getNumberOfSyntaxErrors() + "error"
						+ ((parser.getNumberOfSyntaxErrors() > 1) ? "s" : "") + ".");
			}
		} catch (RecognitionException e) {
			throw new IRParserException(e.getMessage());
		}
		IRBuilder builder = new IRBuilder();
		
		return new IR((NWEntries) builder.visit(pt));
	}

	private static CharStream ANTLRFileStream(String filename) {
		return (CharStream) filename.chars();
	}

}
