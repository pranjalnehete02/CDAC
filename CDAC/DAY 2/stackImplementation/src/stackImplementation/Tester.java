package stackImplementation;

public class Tester implements StackOps{

	
	static int stack[] = new int[5];
	static int top = 0;
	
	
	public static void main(String[] args) {
		Tester Stack = new Tester();

		
		Stack.push(10);
		Stack.push(13);
		Stack.push(10);
		Stack.push(13);
		Stack.push(10);
		
		Stack.show();
		
		Stack.pop();
		System.out.println();
		Stack.show();
 	}

	@Override
	public void push(int element) {
		// TODO Auto-generated method stub
		
		if(isFull()) {
		
		}
		else {
			stack[top] = element;
			top++;	
		}
		
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			
		}
		else {
			top--;
			int topEle = stack[top];
			stack[top] = 0;
			
			return topEle;
		}
		return 0;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top == 0) {
			System.out.println("Index out of Bound");
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top == 5) {
			System.out.println("No Sapce to push");
			return true;
		}
		return false;
	}

	@Override
	public void show() {
		for(int i = 0; i < 5; i++) {
			System.out.print(stack[i] + " ");
		}
		
		//return 0;
		// TODO Auto-generated method stub
		
		
	}
	
}
