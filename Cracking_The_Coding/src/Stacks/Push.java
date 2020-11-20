package Stacks;

public class Push {
static int[] stack = new int[5];
static int top = -1;
public static void push() {
	int x = 5;
	if(top==4) {
		System.out.println("overflow");
	}else {
		top=top+1;
		stack[top]=x;
	}
	for(int i=0;i<stack.length;i++) {
		System.out.print(" "+stack[i]);
	}
}
public static void main(String[] args) {
	push();
	
}
}
