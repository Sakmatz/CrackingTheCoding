package Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/* public class Neighbor{
	public int VertexNum;
	public Neighbor next;
	Neighbor(int vnum, Neighbor nbr){
		this.VertexNum = vnum;
		next = nbr;
	}
}
public class Vertex{
	String name;
	Neighbor adjList;
	Vertex(String name, Neighbor neighbors){
		this.name = name;
		this.adjList = neighbors;
	}
	https://www.youtube.com/watch?v=zVrPdF7f4-I&list=PLs8TmeZHJEeF2UMA8KCI6g0BMDrVUgB0r&index=14
}*/

public class Graph1 {
Vertex[] adjLists;
public Graph1(String file) throws FileNotFoundException {
	Scanner sc = new Scanner(new File(file));
	String graphType = sc.next();
	boolean undirected = true;
	if(graphType.equals("directed")) {
		undirected = false;
	}
	adjLists = new Vertex[sc.nextInt()];
	//read vertices
	for(int v = 0;v<adjLists.length;v++) {
		adjLists[v]=new Vertex(sc.next(),null);
	}
	//read edges
	while(sc.hasNext()) {
		//read vertex name and translate into numbers
		int v1 = indexForName(sc.next());
		int v2 = indexForName(sc.next());
		//add v2 to front of v1's adjacency list
		//add v1 to front of v2's adjacency list
		adjLists[v1].adjList =new Neighbor(v2,adjLists[v2].adjList);
		if(undirected) {
			adjLists[v2].adjList=new Neighbor(v1,adjLists[v1].adjList);
		}
	}
}
int indexForName(String name) {
	for (int v=0; v < adjLists.length; v++) {
		if (adjLists[v].name.equals(name)) {
			return v;
		}
	}
	return -1;
}	

public void print() {
	System.out.println();
	for (int v=0; v < adjLists.length; v++) {
		System.out.print(adjLists[v].name);
		for (Neighbor nbr=adjLists[v].adjList; nbr != null;nbr=nbr.next) {
			System.out.print(" --> " + adjLists[nbr.VertexNum].name);
		}
		System.out.println("\n");
	}
}

/**
 * @param args
 */
public static void main(String[] args) 
throws IOException {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter graph input file name: ");
	String file = sc.nextLine();
	Graph1 graph = new Graph1(file);
	graph.print();

}

}