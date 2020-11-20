package recursionDynamicP;

public class PaintFill {
	public static int [][] fillPaint(int[][] array, int px, int py, int old_color,int new_color) {
	if(array[px][py]==new_color) {
		return array;
	}
		fill(array,px,py,old_color,new_color);
	   return array;
	}
	public static void fill(int[][] array, int px, int py, int old_color,int new_color) {
		if(px<0 || py<0 ||px>=array.length || py>=array[0].length|| array[px][py]!=old_color ) {
			return;
		}
		
			array[px][py]=new_color;
			
			fill(array,px-1,py,old_color,new_color);
			fill(array,px+1,py,old_color,new_color);
			fill(array,px,py-1,old_color,new_color);
			fill(array,px,py+1,old_color,new_color);
		
	}
	public static void print(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			System.out.print("  "+array[i][j]);	
			}
			System.out.println();
		}
	}
public static void main(String args[]) {
	int[][] array = {{0,1,0},{0,1,1},{0,1,1}};
	int px = 1;
	int py= 1;
	int old_color = array[px][py];
	System.out.println(old_color);
	int new_color = 2;
	print(array);
	System.out.println("After filling paint.");
	fillPaint(array,px,py,old_color,new_color);
	print(array);
}
}
