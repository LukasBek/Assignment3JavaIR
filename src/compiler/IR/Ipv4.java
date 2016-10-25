package compiler.IR;

public class Ipv4 extends IR {
	
	Tag tag;
	
	public Ipv4(Tag tag){
		this.tag = tag;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
