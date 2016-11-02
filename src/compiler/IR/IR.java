package compiler.IR;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.FRONTEND.Assignment4grammarLexer;
import compiler.FRONTEND.Assignment4grammarParser;
import exceptions.CompilerException;
import exceptions.IRParserException;
import java.io.IOException;

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
			CharStream input = ANTLRFileStram(filename);
			
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

	private static CharStream ANTLRFileStram(String filename) {
		return null;
	}

}
