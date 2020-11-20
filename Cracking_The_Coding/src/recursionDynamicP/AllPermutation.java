package recursionDynamicP;

public class AllPermutation {
	
	private void permutation(String str,int l,int r) {
		/*
		 *      | ABC->  ABC ACB 
		 * ABC  | BAC->  BAC BCA 
		 *      | CBA->  CBA CAB
		 * */
		if(l==r) {
			System.out.println(str);
		}else {
			for(int i=l;i<=r;i++) {
				str = swap(str, l,i);
				permutation(str,l+1,r);
				str = swap(str, l,i);
			}
		
		}
		
	}
	public String swap(String str,int i, int j) {
	    char[] array = str.toCharArray();
		char temp ;
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		
		return String.valueOf(array);
		
	}
public static void main(String args[]) {
	AllPermutation per = new AllPermutation();
	String str = "ABCD";
	int l = 0;
	int r = str.length()-1;
	per.permutation(str,l,r);
}
}
