package recursionDynamicP;

public class MagicArray {
	public static void magicElement(int[] array) {
		int length = array.length;
		if (array.length==1 && array[0]!=0) {
			System.out.println("Not available");
			
		}
		if((array[length/2])>(length/2)) {
			int[] narray = new int[length/2];
			for(int i=0;i<length/2;i++) {
				narray[i]=array[i];
			}
			magicElement(narray);
		}
		else if((array[length/2])<(length/2)) {
			int[] narray = new int[length/2];
			for(int i=(length/2)+1;i<length;i++) {
				narray[i]=array[i];
			}
			magicElement(narray);
		}
		else {
			
			System.out.println(length/2);
		}
		
	}
public static void main(String args[]) {
	int[] array = {0,3,4,5,6,8,10,11,12,13};
	magicElement(array);
}
}
