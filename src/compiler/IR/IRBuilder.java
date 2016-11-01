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
//		TimeContext time = ectx.time();
//		DateContext date = ectx.date();
//		PacketContext packet = ectx.packet();
		
		Time time = visitTime(ctx.time());
		Date date = visitDate(ctx.date());
		Packet packet = visitPacket(ctx.packet());
	
		return new NWEntry(date, time, packet);
	}
	
	@Override
	public Date visitDate(DateContext ctx) {
		int year = Integer.parseInt(ctx.NUMBER(0).getText());
		int month = Integer.parseInt(ctx.NUMBER(1).getText());
		int day = Integer.parseInt(ctx.NUMBER(2).getText());
		Date date = new Date(year, month, day);
		return date;
	}
	
	@Override
	public Time visitTime(TimeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public Packet visitPacket(PacketContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Ipv4Content visitIpv4content(Ipv4contentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	@Override
	public Ipv4Ttl visitIpv4ttl(Ipv4ttlContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Flags visitIpv4flags(Ipv4flagsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DumpLine visitDumpline(DumplineContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Length visitLength(LengthContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Id visitIpv4id(Ipv4idContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mac visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Offset visitIpv4offset(Ipv4offsetContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProtInfo visitProtinfo(ProtinfoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Proto visitIpv4proto(Ipv4protoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4 visitIpv4(Ipv4Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlagValues visitFlagvalues(FlagvaluesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Tos visitIpv4tos(Ipv4tosContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProtName visitProtname(ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ipv4Fields visitIpv4fields(Ipv4fieldsContext ctx) {
		
		Ipv4Tos ipv4Tos = visitIpv4tos(ctx.ipv4tos());
		Ipv4Ttl ipv4Ttl = visitIpv4ttl(ctx.ipv4ttl());
		Ipv4Id ipv4Id = visitIpv4id(ctx.ipv4id());
		Ipv4Offset ipv4Offset = visitIpv4offset(ctx.ipv4offset());
		Ipv4Flags ipv4Flags = visitIpv4flags(ctx.ipv4flags());
		Ipv4Proto ipv4Proto = visitIpv4proto(ctx.ipv4proto());
		Length length = visitLength(ctx.length());
		
		return new Ipv4Fields(ipv4Tos, ipv4Ttl, ipv4Id, ipv4Offset, ipv4Flags, ipv4Proto, length);
	}

	@Override
	public Tag visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}