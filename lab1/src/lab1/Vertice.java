package lab1;
//first update

public class Vertice {
	private String word;//�˹�review
	private Vertice next=null,ajen;
	private int weight;
	private int rank;
	private int d;
	private Vertice pitemp;
	public Vertice() {
		word = "";
		ajen = null;
		weight = 0;//����review
		d = 10000000;
		pitemp = null;
	}
	public Vertice(Vertice v) {
		this.word = v.getWord();
		this.weight = 0;
	}
	public Vertice(String word,Vertice next,Vertice ajen) {
		this.word = word;
		this.next = next;
		this.ajen = ajen;
		this.weight = 0;
	}
	public String getWord() {
		return this.word;
	}
	public Vertice getNext() {
		return this.next;
	}
	public Vertice getAjen() {
		return this.ajen;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getRank() {
		return this.rank;
	}
	public int getD() {
		return this.d;
	}
	public Vertice getPi() {
		return this.pitemp;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public void setNext(Vertice next) {
		this.next = next;
	}
	public void setAjen(Vertice ajen) {
		this.ajen = ajen;
	}
	public void setWeight(final int weight) {
		this.weight = weight;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setD(int d) {
		this.d = d;
	}
	public void setPi(Vertice pi) {
		this.pitemp = pi;
	}
}
