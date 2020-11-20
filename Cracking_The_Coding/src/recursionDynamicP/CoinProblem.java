package recursionDynamicP;

import java.util.Arrays;

public class CoinProblem {
	public static int[][] paymentWays(int[] coin,int n,int[][] ways) {
		
		ways[0][0]=1;
		ways[1][0]=1;
		ways[2][0]=1;
		ways[3][0]=1;
		print(ways);
		ways[0][2]=1;
		ways[0][4]=1;
		ways[0][6]=1;
		ways[0][8]=1;
		ways[0][10]=1;
		
		ways[0][1]=0;
		ways[0][3]=0;
		ways[0][5]=0;
		ways[0][7]=0;
		ways[0][9]=0;
		
		System.out.println(Arrays.toString(coin));
		for(int i=1;i<coin.length;i++) {
		   for(int j=0;j<n+1;j++) {
           
           
			   if(coin[i]<j){
        	   ways[i][j]=ways[i-1][j];
           }
           else {
        	   ways[i][j]=ways[i-1][j]+ways[i][j-coin[i]];
           }
		}
	}
		print(ways);
		return ways;
	}
	public static void print(int[][] ways) {
		for(int i =0;i<ways.length;i++) {
			for(int j=0;j<ways[i].length;j++) {
				System.out.print(ways[i][j]+" ");
			}
		System.out.println();
		}
	}
public static void main(String args[]) {
	int[] coin = {0,2,3,5,10};
	int n =10;
	int[][] ways = new int[coin.length][n+1];
	 paymentWays(coin,n,ways);
	
}
}
