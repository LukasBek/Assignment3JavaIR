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
		int hours = Integer.parseInt(ctx.NUMBER(0).getText());
		int minutes = Integer.parseInt(ctx.NUMBER(1).getText());
		double seconds = Integer.parseInt(ctx.NUMBER(2).getText());
		Time time = new Time(hours, minutes, seconds);
		return time;
	}	

	@Override
	public Packet visitPacket(PacketContext ctx) {
		Mac mac1 = visitMac(ctx.mac(0));
		Mac mac2 = visitMac(ctx.mac(1));
		Type type = visitType(ctx.type());
		Length length = visitLength(ctx.length());
		Ipv4Content content = visitIpv4content(ctx.ipv4content());
		Packet packet = new Packet(mac1, mac2, type, length, content);
		return packet;
	}


	@Override
	public Ipv4Content visitIpv4content(Ipv4contentContext ctx) {
		Ipv4Fields fields = new Ipv4Fields(ctx.ipv4fields());
		Ipv4ADR adr1 = new Ipv4Fields(ctx.IPV4ADR(0));
		Ipv4ADR adr2 = new Ipv4Fields(ctx.IPV4ADR(1));
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tag visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}