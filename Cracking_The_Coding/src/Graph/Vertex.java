package Graph;

public class Vertex{
	String name;
	Neighbor adjList;
	Vertex(String name, Neighbor neighbors){
		this.name = name;
		this.adjList = neighbors;
	}}