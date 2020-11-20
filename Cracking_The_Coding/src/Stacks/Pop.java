package Stacks;

public class Pop {
static int[] stack = new int[5];
static int top = -1;

public static void push() {
	int x = 2;
	if(top==4) {
		System.out.println("overflow");
	}else {
		top =top+1;
		stack[top]=x;
	}
	for(int i = 0;i<stack.length;i++) {
		System.out.print(" "+stack[i]);
	}
}
public static void pop() {
	if(top==-1) {
		System.out.println("underflow");
	}
	else {
		System.out.println();
		System.out.println(stack[top]);
		top--;
	}
}
public static void main(String args[]) {
	push();
	pop();
}
}
