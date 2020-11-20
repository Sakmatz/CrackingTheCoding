package Bitmanipulation;

public class Insertion {
	public static int updateBits(int n, int m, int i, int j) {
		// will equal sequence of all 1s
		int allOnes = ~0;//-1
		System.out.println("this is all ones "+allOnes);
		int left = allOnes << (j + 1);//-1<<3 = 1111<<3 = 1000
		System.out.println("left is: "+left);
		int right = (1 << i) - 1;//0001<<1 = 0010
		System.out.println("right is: "+right);
		int mask = left | right; //1000|0001 = 1001
		System.out.println("mask is: "+mask);
		n = n & mask; //0101 & 1001 = 0001
		System.out.println("n is: "+n);
		m = m << i;
		return n | m;
	}
	public static void main(String args[]) {
		int n = 5;
		int m = 3;
		int i = 1;
		int j = 2;
		int Answer = updateBits(n,m,i,j);
		System.out.println(Answer);
	}
}
