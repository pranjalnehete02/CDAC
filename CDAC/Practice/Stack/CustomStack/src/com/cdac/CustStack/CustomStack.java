package com.cdac.CustStack;

public class CustomStack {
	//creating an body for CustomStack class
	private int maxSize;
	private int[] stack_Array;
	private int top;
	
	//Constructor parameterized
	public CustomStack(int size) {
		maxSize = size;
		stack_Array = new int[maxSize];
		top = -1;
	}
	
				//operations:
	
	//PUSH
	public void push(int value) throws StackOverFlowException{
		if (isFull()) {
			//System.out.println("Stack is full");
			throw new StackOverFlowException("The Stack is Full");
		}
		stack_Array[++top] = value;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return (top == maxSize -1);
		}
	
	
	//POP
	public int pop() throws StackUnderFlowException{
		if (isEmpty()) {
			throw new StackUnderFlowException("Stack is empty");
		}
		return stack_Array[top--];
		
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	
	private int peek() {
		// TODO Auto-generated method stub
		System.out.println(stack_Array[top]);
		return 0;
	}
	
	//EXCEPTION HANDLING
	class StackOverFlowException extends Exception{
		public StackOverFlowException(String msg) {
			super(msg);
		}
	}
	
	class StackUnderFlowException extends Exception{
		public StackUnderFlowException(String msg) {
			super(msg);
		}
	}
	
	
					//main function
	public static void main(String[] args) {
		try {
			CustomStack Stack = new CustomStack(5);
			
			Stack.push(1);
			Stack.push(2);
			Stack.push(3);
			Stack.push(4);
			Stack.push(5);
			
			Stack.peek();
			Stack.pop();
			
			Stack.peek();
			Stack.pop();
			
			Stack.peek();
			Stack.pop();
			
			Stack.peek();
			Stack.pop();
			
			Stack.peek();
			Stack.pop();
			
			Stack.peek();		
		}
		catch(StackOverFlowException e) {
			System.out.println("Stack OverFlow: "+ e.getMessage());
		}
		catch(StackUnderFlowException e) {
			System.out.println("Stack UnderFlow" +e.getMessage());
		}
		
	}

	

	
}


















