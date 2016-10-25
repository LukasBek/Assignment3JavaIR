package compiler.IR;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import compiler.FRONTEND.Assignment4grammarParser;
import compiler.FRONTEND.Assignment4grammarParser.DateContext;
import compiler.FRONTEND.Assignment4grammarParser.DumplineContext;
import compiler.FRONTEND.Assignment4grammarParser.EntriesContext;
import compiler.FRONTEND.Assignment4grammarParser.PacketContext;
import compiler.FRONTEND.Assignment4grammarParser.ProtinfoContext;
import compiler.FRONTEND.Assignment4grammarParser.ProtnameContext;
import compiler.FRONTEND.Assignment4grammarParser.TagContext;
import compiler.FRONTEND.Assignment4grammarParser.TimeContext;
import compiler.FRONTEND.Assignment4grammarParser.TypeContext;
import compiler.FRONTEND.Assignment4grammarParser.EntryContext;
import compiler.FRONTEND.Assignment4grammarParser.FlagvaluesContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4Context;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4contentContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4fieldsContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4flagsContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4idContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4offsetContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4protoContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4tosContext;
import compiler.FRONTEND.Assignment4grammarParser.Ipv4ttlContext;
import compiler.FRONTEND.Assignment4grammarParser.LengthContext;
import compiler.FRONTEND.Assignment4grammarParser.MacContext;
import compiler.FRONTEND.Assignment4grammarVisitor;

public class IRBuilder extends AbstractParseTreeVisitor<IR> implements Assignment4grammarVisitor<IR>{

	@Override
	public NWEntries visitEntries(EntriesContext ctx) {
		LinkedList<NWEntry> entry = new LinkedList<NWEntry>();
		
		for (EntryContext c : ctx.entry() ) {
			entry.add(visitEntry(c));
		}
		return new NWEntries(entry);
	}
	
	@Override
	public NWEntry visitEntry(EntryContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IR visitDate(DateContext ctx) {
		
		return null;
	}
	
	@Override
	public IR visitTime(TimeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public IR visitPacket(PacketContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IR visitIpv4content(Ipv4contentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	@Override
	public IR visitIpv4ttl(Ipv4ttlContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4flags(Ipv4flagsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitDumpline(DumplineContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitLength(LengthContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4id(Ipv4idContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4offset(Ipv4offsetContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtinfo(ProtinfoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4proto(Ipv4protoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4(Ipv4Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitFlagvalues(FlagvaluesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4tos(Ipv4tosContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtname(ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4fields(Ipv4fieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	

//	entries : entry *;
	
	public NWEntries visitEntry(EntriesContext ectx){
		
		
	}	
	
//	entry : date time packet;
	
//	public NWEntry visitEntry(EntryContext ectx){
////		TimeContext time = ectx.time();
////		DateContext date = ectx.date();
////		PacketContext packet = ectx.packet();
//		
//		String time = ectx.time().getText();
//		String date = ectx.date().getText();
//		PacketContext packet = ectx.packet();
//		visitPacket(packet);
//		
//		return new NWEntry(date, time, packet);
//		
//	}
//	
//	public Packet visitPacket(PacketContext packetContext){
//
//		packetContext.
//	
//		
//		return ;
//		
//	}
//
}
