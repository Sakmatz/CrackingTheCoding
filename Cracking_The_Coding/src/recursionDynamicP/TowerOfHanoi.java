package recursionDynamicP;

public class TowerOfHanoi {
	public static void buildTowerOfHanoi(char source,char aux,char destination,int n) {
		if(n==1) {
			System.out.println("n= "+n+" "+source+" "+ "-> " + destination);
		}
		else {
			buildTowerOfHanoi(source, destination, aux, n-1);
			System.out.println("n= "+n+" "+source+" "+ "-> " + destination);
			buildTowerOfHanoi(aux, source, destination, n-1);
		}
	}
public static void main(String args[]) {
	char source = 'A';
	char aux = 'B';
	char destination = 'C';
	int n=3;
	buildTowerOfHanoi(source,aux,destination,n);
}
}
