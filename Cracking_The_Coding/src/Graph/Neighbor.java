package Graph;

public class Neighbor{
	public int VertexNum;
	public Neighbor next;
	Neighbor(int vnum, Neighbor nbr){
		this.VertexNum = vnum;
		next = nbr;
	}
}