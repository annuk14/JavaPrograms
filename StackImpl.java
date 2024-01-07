package JavaPrograms;



/**
 * Program to implement stack using array
 */
public class StackImpl {
	
	
	int size;
	int stack[];
	int top;
	
	public StackImpl(int size) {
		this.size=size;
		this.stack=new int[size];
		this.top=-1;
	}
	
	public boolean isFull() {
		return (top==size-1);
		
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void push(int data) {
		
		if(isFull()) {
			System.out.println("Overflow Condition:stack is full");
		}else {
			top++;
			stack[top]=data;
			System.out.println("pushed data is:"+stack[top]);
		}
	}
	
	public void pop() {
		
		int item;
		if(isEmpty()) {
			System.out.println("Underflow condition:stack is empty");
		}else {
			item=stack[top];
			top--;
			System.out.println("popped data is:"+item);
		}
	}
	
	public void peek() {
		
		if(isEmpty()) {
			System.out.println("Underflow condition:stack is empty");
		}else {
			System.out.println("peek data is:"+stack[top]);

		}
	}
	
	public void display() {
		
		int i;
		for(i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {

		StackImpl si=new StackImpl(5);
//		si.display();
		si.push(1);
		si.push(2);
		si.display();
		si.pop();
		si.display();
		si.peek();
		
	}

}
