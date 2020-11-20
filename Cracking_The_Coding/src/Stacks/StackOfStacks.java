package Stacks;

public class StackOfStacks {
static int top;
static Stackset stack;

static Stackset stackHead;
static class Stackset{
	int stackId;
	int limit;
	int OneStackLimit;
	static Stackset nextStack;
	Stackset(int stackId){
		this.stackId=stackId; 
	}
}
public static void pushStack(StackOfStacks stack) {
    System.out.println("here are the stacks id: ");
	Stackset temp = stackHead;
	while(temp!=null) {
		System.out.println(" "+temp.stackId);
		temp=temp.nextStack;
	}
	;
}
public static void main(String[] args) {
	StackOfStacks stackSet1 = new StackOfStacks();
	Stackset stack1 = new Stackset(1);
	Stackset stack2 = new Stackset(2);
	Stackset stack3 = new Stackset(3);
	
	
}
}
