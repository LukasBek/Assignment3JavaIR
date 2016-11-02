package support;

import support.VisitorException;
import compiler.IR.*;

public abstract class IRElementVisitorWithArgument<T> {
	
	public abstract T visitEntries(NWEntries e, T arg) throws VisitorException;
	public abstract T visitEntry(NWEntry e, T arg) throws VisitorException;
	public abstract T visitDate(Date e, T arg) throws VisitorException;
	public abstract T visitTime(Time e, T arg) throws VisitorException;
	public abstract T visitPacket(Packet e, T arg) throws VisitorException;
	public abstract T visitIpv4conten(Ipv4Content e, T arg) throws VisitorException;
	public abstract T visitIpv4ttl(Ipv4Ttl e, T arg) throws VisitorException;
	public abstract T visitIpv4flags(Ipv4Flags e, T arg) throws VisitorException;
	public abstract T visitDumpline(DumpLine e, T arg) throws VisitorException;
	public abstract T visitLength(Length e, T arg) throws VisitorException;
	public abstract T visitType(Type e, T arg) throws VisitorException;
	public abstract T visitIpv4id(Ipv4Id e, T arg) throws VisitorException;
	public abstract T visitMac(Mac e, T arg) throws VisitorException;
	public abstract T visitIpv4offset(Ipv4Offset e, T arg) throws VisitorException;
	public abstract T visitProtinfo(ProtInfo e, T arg) throws VisitorException;
	public abstract T visitIpv4proto(Ipv4Proto e, T arg) throws VisitorException;
	public abstract T visitIpv4(Ipv4 e, T arg) throws VisitorException;
	public abstract T visitFlagvalues(FlagValues e, T arg) throws VisitorException;
	public abstract T visitIpv4tos(Ipv4Tos e, T arg) throws VisitorException;
	public abstract T visitProtname(ProtName e, T arg) throws VisitorException;
	public abstract T visitIpv4fields(Ipv4Fields e, T arg) throws VisitorException;
	public abstract T visitTag(Tag e, T arg) throws VisitorException;

}