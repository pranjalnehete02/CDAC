package com.cdac.exam;

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
	
	
													//OPERATIONS:
	
	//PUSH
	public void push(int value) throws StackOverFlowException{
		if (isFull()) {
			//System.out.println("Stack is full");
			throw new StackOverFlowException("The Stack is Full");
		}
		stack_Array[++top] = value;
	}

	//isFull
	private boolean isFull() {
		// TODO Auto-generated method stub
		return (top == maxSize -1);
		}
	
	
	//POP
	public int pop() throws StackUnderFlowException{
		if (isEmpty()) {
			//System.out.println("Stack is Empty");
			throw new StackUnderFlowException("Stack is empty");
		}
		return stack_Array[top--];	
	}

	
	//isEmpty
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	
	//top
	public int top() {
		// TODO Auto-generated method stub
		System.out.println(stack_Array[top]);
		return 0;
	}

	//display
	public int display() {
		for(int i = 0; i < maxSize; i++) {
			System.out.println(stack_Array[i]);
		}
		return 0;
		
	}

	//increment k by val
	public void increment(int k, int val) {   
        if(k > maxSize) {
        	for(int i = 0; i < maxSize; i++) {
        		stack_Array[i] = stack_Array[i + val];
        	}
        }
        else {
        	for (int i = 0; i < k; i++) {
        		stack_Array[i] = stack_Array[i + val];
        	}
        }
    }
	
	
											//EXCEPTION HANDLING
	//stackoverflow
	class StackOverFlowException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public StackOverFlowException(String msg) {
			super(msg);
		}
	}
	
	
	//stackUnderFlow
	class StackUnderFlowException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public StackUnderFlowException(String msg) {
			super(msg);
		}
	}
	
	
					//main function
	public static void main(String[] args) {
		try {
			CustomStack Stack = new CustomStack(5);
			System.out.println("The elements we have pushed");
			Stack.push(1);
			Stack.push(2);
			Stack.push(3);
			Stack.push(4);
			Stack.push(5);
			
			Stack.display();
			
			Stack.pop();
		
			System.out.println("After poping an element");
			Stack.display();

			Stack.push(5);
			
			Stack.increment(2, 2);
			System.out.println("After the operation increment: ");			
			Stack.display();

							
		}
		catch(StackOverFlowException e) {
			System.out.println("Stack OverFlow: "+ e.getMessage());
		}
		catch(StackUnderFlowException e) {
			System.out.println("Stack UnderFlow" +e.getMessage());
		}
		
	}

	

	
}


















