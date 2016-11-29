package compiler.IR;

import java.util.ArrayList;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

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
	DumpLine dumpLine;

	
	
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
		Ipv4Fields fields = visitIpv4fields(ctx.ipv4fields());
		String adr1S = ctx.IPV4ADR(0).getText();
		String adr2S = ctx.IPV4ADR(1).getText();
		Ipv4ADR adr1 = convertAddress(adr1S);
		Ipv4ADR adr2 = convertAddress(adr2S);

		ProtInfo prot = visitProtinfo(ctx.protinfo());
		dumpLine = new DumpLine();
		for (int i = 0; i < ctx.dumpline().size(); i++){
			Hex hex = new Hex(ctx.dumpline(i).HEXNUMBER().getText());
			Dump dump = new Dump(hex, ctx.dumpline(i).getText());
			dumpLine.addDump(dump);
		}
		
		Ipv4Content content = new Ipv4Content(fields, adr1, adr2, prot, dumpLine);
		
		return content;
	}	
	private Ipv4ADR convertAddress(String adrString){
		String[] adrParts = adrString.split(".");
		int oct1 = Integer.parseInt(adrParts[0]);
		int oct2 = Integer.parseInt(adrParts[1]);
		int oct3 = Integer.parseInt(adrParts[2]);
		int oct4 = Integer.parseInt(adrParts[3]);
		int port = Integer.parseInt(adrParts[4]);
		
		return new Ipv4ADR(oct1, oct2, oct3, oct4, port);
	}
	
	@Override
	public Ipv4Ttl visitIpv4ttl(Ipv4ttlContext ctx) {
		int number = Integer.parseInt(ctx.NUMBER().getText());
		Ipv4Ttl ttl = new Ipv4Ttl(number);
		return ttl;
	}

	@Override
	public Ipv4Flags visitIpv4flags(Ipv4flagsContext ctx) {
		FlagValues fv = visitFlagvalues(ctx.flagvalues());
		Ipv4Flags flags = new Ipv4Flags(fv);
		return flags;
	}

	@Override
	public DumpLine visitDumpline(DumplineContext ctx) {
		return dumpLine;
	}

	@Override
	public Length visitLength(LengthContext ctx) {
		int length = Integer.parseInt(ctx.NUMBER().getText());
		Length length2 = new Length(length);
		return length2;
	}

	@Override
	public Type visitType(TypeContext ctx) {
		Ipv4 ipv4 = visitIpv4(ctx.ipv4());
		Type type = new Type(ipv4);
		return type;
	}

	@Override
	public Ipv4Id visitIpv4id(Ipv4idContext ctx) {
		Ipv4Id id = new Ipv4Id(Integer.parseInt(ctx.NUMBER().getText()));
		return id;
	}

	@Override
	public Mac visitMac(MacContext ctx) {
		Mac mac = new Mac(ctx.MAC().getText());
		return mac;
	}

	@Override
	public Ipv4Offset visitIpv4offset(Ipv4offsetContext ctx) {
		
		int Ipv4Offset = Integer.parseInt(ctx.getText());
		
		return new Ipv4Offset(Ipv4Offset);
	}

	@Override
	public ProtInfo visitProtinfo(ProtinfoContext ctx) {
		
		Length length = visitLength(ctx.length());
		ProtName protName = visitProtname(ctx.protname());
		
		return new ProtInfo(length, protName);
	}

	@Override
	public Ipv4Proto visitIpv4proto(Ipv4protoContext ctx) {
		
		ProtName protName = visitProtname(ctx.protname());
		int number = Integer.parseInt(ctx.NUMBER().getText());
		
		return new Ipv4Proto(protName, number);
	}

	@Override
	public Ipv4 visitIpv4(Ipv4Context ctx) {
		
		Tag tag = visitTag(ctx.tag());
		
		return new Ipv4(tag);
	}

	@Override
	public FlagValues visitFlagvalues(FlagvaluesContext ctx) {

		String Flagvalue = ctx.getText();
		
		return new FlagValues(Flagvalue);
	}

	@Override
	public Ipv4Tos visitIpv4tos(Ipv4tosContext ctx) {
		
		String hexName = ctx.HEXNUMBER().getText();
		Hex hex = new Hex(hexName);
		
		return new Ipv4Tos(hex);
	}

	@Override
	public ProtName visitProtname(ProtnameContext ctx) {
		
		String protname = ctx.getText();
		
		return new ProtName(protname);
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
		
		String hexName = ctx.HEXNUMBER().getText();
		Hex hex = new Hex(hexName);
		
		return new Tag(hex);
	}
}