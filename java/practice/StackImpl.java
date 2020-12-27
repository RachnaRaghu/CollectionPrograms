package com.java.practice;

public class StackImpl implements IStack {
	protected Object[] stackArray;
	protected int tos;
		
	public StackImpl(int capacity) {
		super();
		this.stackArray = new Object[capacity];
		this.tos = -1;
	}

	@Override
	public void push(Object obj) {
		
		stackArray[++tos]=obj;
		System.out.println(obj + " pushed into stack");
		
		
	}

	@Override
	public Object pop() {
		String popItem = (String) stackArray[tos--]; 
        return popItem;
	}

	public Object peek() {
		String atTop = (String) stackArray[tos];
	     return atTop;
	}
}
