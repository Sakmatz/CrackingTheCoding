package Stacks;

import java.util.Arrays;

public class Peep {
static int[] stack = new int[5];
static int top = -1;
public static void push() {
	int x = 5;
	if(top == 4) {
		System.out.println("stack is overflow");
	}else {
		top++;
		stack[top]=x;
	}
	
}
public static void pop() {
	if(top==-1) {
		System.out.println("stack underflow");
	}
	else {
		System.out.println(stack[top]);
		top--;
	}

}
public static void display() {
	int i;
	for(i=top;i>=0;i--) {
		System.out.print("this is stack: "+stack[i]);
	}
}
public static void peek() {
	if(top==-1) {
		System.out.println("underflow");
	}else {
		System.out.println(stack[top]);
	}
}
public static void main(String args[]) {
	
	push();//
	pop();
	push();
	peek();
	display();
}
}
