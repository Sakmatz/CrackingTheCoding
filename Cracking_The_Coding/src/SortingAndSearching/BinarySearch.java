package SortingAndSearching;
//time complexity is O(logn) in worst cases and best case O(1) means found data at mid on the first time
public class BinarySearch {
	public static int binSearch(int[] array,int data) {
		int n = array.length;
		int r = n-1;
		int l = 0;
		
		while(l<r) {
			int mid = (l+r)/2;//need to be inside the loop
			if(data==array[mid]) {
				return mid;
			}
			else if(data<array[mid]){
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return -1;
	}
public static void main(String args[]) {
	int[] array = {5,9,17,23,25,45,59,63,71,89};
	int data = 71;
	int dataAtIndex = binSearch(array,data);
	System.out.println(dataAtIndex);
}
}
