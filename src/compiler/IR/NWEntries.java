package compiler.IR;

import compiler.parsers.Date;
import compiler.parsers.Packet;
import compiler.parsers.Time;

public class NWEntries {
	
	private Date date;
	private Time time;
	private Packet packet;
	
//	entry : date time packet;
	
	public NWEntries(Date date, Time time, Packet packet){
		this.date = date;
		this.time = time;
		this.packet = packet;
	}
	
	public String getDate(){
		return date.toString();
	}
	
	public String getTime(){
		return time.toString();
	}
	
//	??????
//	public String getPacket(){
//		return packet.toString();
//	}

}
