package logicAndPuzzles;

public class CheckPrime {
	public static boolean checkP(int num,int n) {
		int pnum = 0;
		if(num<2) {
			return false;
		}
		if(num % 2 == 0) {
			return false;
		}
		else {
			for(int i =3;i<=Math.sqrt(n);i++) {
				if(num%i==0) {
					return false;
				}
				return true;
				}
			}
		return true;
		}
	
public static void main(String args[]) {
	int num = 20;
	int n = 100;
	boolean check = checkP(num,n);
	System.out.println(check);
}
}
