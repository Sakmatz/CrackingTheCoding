package Stacks;

import java.util.Scanner;

public class StackMin {
static int[] stack = new int[5];
static int[] minStack = new int[5];
static int top = -1;
public static void push(int data) {
	if(top==4) {
		System.out.println("stack is full");
	}else {
		top++;
		stack[top]=data;
		minStack[top]=data;
	}
}
public static void pushStacks(int data) {
	if(top==-1) {
		top=top+1;
		stack[top]=data;
		minStack[top]=data;
	}else {
		top = top+1;
		stack[top]=data;
		if(stack[top]<minStack[top-1]) {
			minStack[top]=stack[top];
		}else {
			minStack[top]=minStack[top-1];
		}
	}
}
public static void pop() {}
public static void min() {
	System.out.println();
	System.out.println("min is: "+minStack[top]);
}
public static void display() {
	System.out.println("stack is: ");
	for(int i=top;i>=0;i--) {
		System.out.print(" "+stack[i]);
	}
	System.out.println();
	System.out.println("minStack is: ");
	for(int i=top;i>=0;i--) {
		System.out.print(" "+minStack[i]);
	}
	
}
public static void main(String[] args) {
	pushStacks(4);
	pushStacks(2);
	pushStacks(5);
	pushStacks(1);
	display();
	min();

//code for sorting the array
}}
