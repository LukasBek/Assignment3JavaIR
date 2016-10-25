package compiler.parsers;

public class Entry {
	private Date date;
	private Time time;
	private Packet packet;
	
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
