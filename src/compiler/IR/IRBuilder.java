package compiler.IR;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import compiler.FRONTEND.Assignment4grammarParser;
import compiler.FRONTEND.Assignment4grammarParser.DateContext;
import compiler.FRONTEND.Assignment4grammarParser.EntriesContext;
import compiler.FRONTEND.Assignment4grammarParser.PacketContext;
import compiler.FRONTEND.Assignment4grammarParser.TimeContext;
import compiler.FRONTEND.Assignment4grammarParser.EntryContext;
import compiler.FRONTEND.Assignment4grammarVisitor;

public class IRBuilder extends AbstractParseTreeVisitor<IR> implements Assignment4grammarVisitor<IR>{

//	entries : entry *;
	
	public NWEntries visitEntry(EntriesContext ectx){
		
		LinkedList<NWEntry> entry = new LinkedList<NWEntry>();
		
		for (EntryContext c : ectx.entry() ) {
			entry.add(visitEntry(c));
		}
		return new NWEntries(entry);
	}	
	
//	entry : date time packet;
	
	public NWEntry visitEntry(EntryContext ectx){
//		TimeContext time = ectx.time();
//		DateContext date = ectx.date();
//		PacketContext packet = ectx.packet();
		
		String time = ectx.time().getText();
		String date = ectx.date().getText();
		PacketContext packet = ectx.packet();
		visitPacket(packet);
		
		return new NWEntry(date, time, packet);
		
	}
	
	public Packet visitPacket(PacketContext packetContext){

		packetContext.
	
		
		return ;
		
	}

}
