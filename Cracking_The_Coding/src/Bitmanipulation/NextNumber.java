package Bitmanipulation;

import javax.websocket.Decoder.Binary;

public class NextNumber {
	public static int nextSmallLargeSet(int n) {
		int c = n;
		int c1 = 0;
		 int c0 = 0;
		 
		while(((c&1)==0) && (c!=0)) {
			c0++;
			c1++;
		}
		while((c&1)==1) {
			c1++;
			c=c>>1;
		}
		if(c0+c1==31 || c0+c1==0) {
			return -1;
		}
		
		int p = c0+c1;
		n|=(1<<p);
		int a =1<<p;
		int b= a-1;
		int mask = ~b;
		n= n&mask;
		
		c1=c1-1;
		int x = 1<<c1;
		int y= x-1;
		n = n|y;
		return n;
	}
public static void main(String args[]) {
	int num = 11;
    int nextNum = nextSmallLargeSet(num);
    System.out.println(nextNum);
}
}
