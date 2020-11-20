package recursionDynamicP;
//https://www.geeksforgeeks.org/box-stacking-problem-dp-22/
import java.util.Arrays;

class StackOfBoxes{
	static class Box implements Comparable<Box>{
		//box define kiya
		int h,w,d,area;
		public Box(int h,int w,int d) {
			this.h=h;
			this.w=w;
			this.d=d;
		}
		/*To sort the box array on the basis 
		of area in decreasing order of area */
		@Override
		public int compareTo(Box o) {
			// TODO Auto-generated method stub
			return o.area-this.area;
		}
	}
	public static int maxStackHeight(Box[] arr,int n){
		Box rot[] = new Box[n*3];
		
		for(int i=0;i<n;i++) {
			Box box = arr[i];
			rot[3*i]= new Box(box.h,Math.max(box.w, box.d),Math.min(box.w, box.d));
			rot[3*i+1]= new Box(box.w,Math.max(box.h, box.d),Math.min(box.h, box.d));
			rot[3*i+2]= new Box(box.d,Math.max(box.w, box.h),Math.min(box.w, box.h));
		}
		
		for(int i=0;i<rot.length;i++) {
			rot[i].area=rot[i].w * rot[i].d;
		}
		Arrays.sort(rot);
		
		int count = 3*n;
		int[] msh = new int[count];
		for(int i=0;i<count;i++) {
			msh[i]=rot[i].h;
		}
		for(int i=0;i<count;i++) {
			msh[i]=0;
			Box box = rot[i];
			int val =0;
			for(int j=0;j<i;j++) {
				Box prevBox = rot[j];
				if(box.w<prevBox.w && box.d<prevBox.d) {
					val = Math.max(val, msh[j]);
				}
			}
			msh[i]=val+box.h;
		}
		int max =-1;
		for(int i=0;i<msh.length;i++) {
			max = Math.max(max, msh[i]);
		}
		return max;
	}
	public static void main(String args[]) {
		Box[] arr = new Box[4];
		arr[0]= new Box(4,6,7);
		arr[1]=new Box(1,2,3);
		arr[2]=new Box(4,5,6);
		arr[3]=new Box(10,12,32);
		
		System.out.println("Maximum possible height of the stack is: "+maxStackHeight(arr,4));
	}
}