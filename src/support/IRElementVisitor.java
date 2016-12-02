package support;

import support.*;
import compiler.IR.*;
import exceptions.IntrusionException;

public abstract class IRElementVisitor<T> {
	
	public abstract T visitEntries(NWEntries e) throws VisitorException;
	public abstract T visitEntry(NWEntry e) throws VisitorException, IntrusionException;
	public abstract T visitDate(Date e) throws VisitorException;
	public abstract T visitTime(Time e) throws VisitorException;
	public abstract T visitPacket(Packet e) throws VisitorException;
	public abstract T visitIpv4conten(Ipv4Content e) throws VisitorException;
	public abstract T visitIpv4ttl(Ipv4Ttl e) throws VisitorException;
	public abstract T visitIpv4flags(Ipv4Flags e) throws VisitorException;
	public abstract T visitDumpline(DumpLine e) throws VisitorException;
	public abstract T visitLength(Length e) throws VisitorException;
	public abstract T visitType(Type e) throws VisitorException;
	public abstract T visitIpv4id(Ipv4Id e) throws VisitorException;
	public abstract T visitMac(Mac e) throws VisitorException;
	public abstract T visitIpv4offset(Ipv4Offset e) throws VisitorException;
	public abstract T visitProtinfo(ProtInfo e) throws VisitorException;
	public abstract T visitIpv4proto(Ipv4Proto e) throws VisitorException;
	public abstract T visitIpv4(Ipv4 e) throws VisitorException;
	public abstract T visitFlagvalues(FlagValues e) throws VisitorException;
	public abstract T visitIpv4tos(Ipv4Tos e) throws VisitorException;
	public abstract T visitProtname(ProtName e) throws VisitorException;
	public abstract T visitIpv4fields(Ipv4Fields e) throws VisitorException;
	public abstract T visitTag(Tag e) throws VisitorException;

}