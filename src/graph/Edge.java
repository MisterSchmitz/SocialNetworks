package graph;

public class Edge {
	private int numFrom;
	private int numTo;
	
	public Edge(int from, int to) {
		this.numFrom = from;
		this.numTo = to;
	}

	public int getNumFrom() {
		return this.numFrom;
	}
	
	public void setNumFrom(int v) {
		this.numFrom = v;
	}
	
	public int getNumTo() {
		return this.numTo;
	}
	
	public void setNumTo(int v) {
		this.numTo = v;
	}
	
	@Override
	public String toString() {
		return "E: "+this.getNumFrom()+", "+this.getNumTo();
	}
}
