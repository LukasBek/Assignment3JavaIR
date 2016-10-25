package compiler.IR;

import compiler.FRONTEND.Assignment4grammarParser.DateContext;
import compiler.FRONTEND.Assignment4grammarParser.PacketContext;
import compiler.FRONTEND.Assignment4grammarParser.TimeContext;

public class NWEntry {
	private Date date;
	private Time time;
	private Packet packet;

	public NWEntry(DateContext date, TimeContext time, PacketContext packet) {
		this.date = date;
		this.time = time; 
		this.packet = packet;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Packet getPacket() {
		return packet;
	}
	public void setPacket(Packet packet) {
		this.packet = packet;
	}

}
