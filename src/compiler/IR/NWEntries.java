package compiler.IR;

public class NWEntries {
	
	private LinkedList<Entry> entries;
	
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
