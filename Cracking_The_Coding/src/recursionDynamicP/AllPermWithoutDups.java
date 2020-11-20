package recursionDynamicP;
//not implemented properly https://www.geeksforgeeks.org/distinct-permutations-string-set-2/
public class AllPermWithoutDups {
	private void perm(String str,int l,int r) {
		if(l==r) {
			System.out.print(" "+str);
		}
		else {
			
			for(int i=0;i<=r;i++) {
				str = swap(str,l,i);
				perm(str,l+1,r);
				str = swap(str,l,i);	
			}
		}
	}
	public String swap(String str,int i,int j) {
	   char[] cArray = str.toCharArray();
		char temp=cArray[i];
	    cArray[i]=cArray[j];
	    cArray[j]=temp;
		return String.valueOf(cArray);
		
	}
public static void main(String args[]) {
	AllPermWithoutDups permWithoutDups = new AllPermWithoutDups();
	String str = "ABA";
	int l = 0;
	int r = str.length()-1;
	permWithoutDups.perm(str,l,r);
}
}
