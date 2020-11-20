package Queue;

import java.util.Arrays;

public class ImplementUsingStack {
static int top =-1;
static int top2 =-1;
static int[] MainStack = new int[3];
static int[] SupportStack = new int[3];

public static void enqueue(int data) {
	pushMS(data);
}

public static void pushMS(int data) {
	if(top>2) {
		System.out.println("stack overflow");
	}
	else {
		top=top+1;
		MainStack[top]=data;
	}
}
public static void dequeue() {
	pushSS();
	popSS();
	top=-1;
	for(int i=top2;i>=0;i--) {
		pushMS(SupportStack[i]);
	}
	displaySS();
}
public static void pushSS() {
	if(top2>2) {
		System.out.println("stack 2 is overflow");
	}else {
		
		for(int i=top;i>=0;i--) {
			top2=top2+1;
			SupportStack[top2]=MainStack[i] ;
		}
	}
	
}
public static void popSS() {
	System.out.println("Popped element is: "+SupportStack[top2]);
	top2=top2-1;	
	System.out.println("Now top element is: "+SupportStack[top2]);
}

public static void display() {
	System.out.println(" mainstack or queue is: "+Arrays.toString(MainStack));
}
public static void displaySS() {
	System.out.println("Support stack is: ");
	for(int i=top2;i>=0;i--) {
		System.out.print(" "+SupportStack[i]);
	}
}
public static void main(String args[]) {
	enqueue(1);
	enqueue(2);
	enqueue(3);
	display();
	System.out.println();
	dequeue();
	System.out.println();
	display();
}
}
