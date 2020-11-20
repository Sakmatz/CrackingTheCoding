package Bitmanipulation;
//https://www.geeksforgeeks.org/converting-a-real-number-between-0-and-1-to-binary-string/
public class BinaryToString {
	public static void convert(double num) {
		if(num<0 && num>1) {
			System.out.println("Error");
		}
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while(num>0) {
			if(binary.length()>=32) {
				System.out.println("error");
			}
			double r = num*2;
			if(r>=1) {
				binary.append("1");
				num = r-1;
			}else {
				binary.append(0);
				num=r;
			}
			System.out.println(binary.toString());
		}
	}
public static void main(String args[]) {
	double num = .72;
	convert(num);
}
}
