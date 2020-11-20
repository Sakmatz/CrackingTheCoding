package Stacks;

import java.util.Arrays;

public class ThreeInOne {
static int top=-1;
static int[] stack = new int[9];
public static void splitStack() {
	int n = stack.length;
	int pt1End = (n/3) -1;
	int pt2St =  n/3;
	int pt2End	= (2*n/3)-1;
	int pt3St = 2*n/3;
	int pt3End = n;
	
	//part1 = 0 to length/3-1
	//part2 = length/3 to 2*length/3-1
	//part3 = 2*length/3 to length-1
	
	//part1 = top to 2*length/3
	//part2 = ((2*length)/3)-1 to length/3
	//part3 = (n/3)-1 to 0
	System.out.println();
	System.out.println("this is stack1:");
	for(int i=top;i>=(2*n)/3;i--) {
		System.out.print(" "+stack[i]);
	}
   
	System.out.println();
	System.out.println("this is stack2:");
	for(int i=((2*n)/3)-1;i>=n/3;i--) {
		System.out.print(" "+stack[i]);
	}
	
	System.out.println();
	System.out.println("this is stack3:");
	for(int i=(n/3)-1;i>=0;i--) {
		System.out.print(" "+stack[i]);
	}
}
public static void push(int data) {
	if(top==8) {
		System.out.println("stack is full");
	}else {
		top = top+1;
		stack[top]= data;
	}
}
public static void display() {
	for(int i=top;i>=0;i--) {
		System.out.print(" "+stack[i]);
	}
}
public static void main(String args[]) {
	push(10);
	push(20);
	push(30);
	push(40);
	push(50);
	push(60);
	push(70);
	push(80);
	push(90);
	
	display();
	splitStack();
}
}
