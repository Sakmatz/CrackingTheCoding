package Queue;
public class ImplementUsingArray {
static int[] Queue = new int[5];
static int front=-1;
static int rear=-1;
public static void enqueue(int data) {
	
	if(rear==Queue.length-1) {
		System.out.println();
		System.out.println("Cant add more bcz queue overflow");
	}else if(front==-1 && rear==-1) {
		front = front+1;
		rear = rear+1;
		Queue[rear]=data;
		System.out.println();
		System.out.print(" "+Queue[rear]);
	}else {
		rear=rear+1;
		Queue[rear]=data;
		System.out.print(" ");
		System.out.print(" "+Queue[rear]);
	}
}
public static void peek() {
	System.out.println("Peek of the queue is: "+Queue[front]);
}
public static void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(" "+Queue[i]);
		}
}
public static void dequeue() {
	if(front == -1 && rear == -1) {
		System.out.println("Queue is empty. you cant remove.");
	}
	else if(front==rear){
		front = rear =-1;
	}
	else {
		System.out.println();
		System.out.println("removed element is: "+Queue[front]);
		front = front+1;		
		System.gc();
	}
}
public static void main(String args[]) {
	enqueue(1);
	enqueue(2);
	enqueue(3);
	enqueue(4);
	enqueue(5);
	enqueue(6);//checking for overflow condition
	peek();
	display();
	dequeue();
	peek();
	display();
}
}
