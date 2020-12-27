package com.java.practice;

public class SafeStackImpl extends StackImpl implements ISafeStack{
	protected Object[] stackArray;
	protected int tos;

	public SafeStackImpl(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEmpty() {
		if(tos<0)
		return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		if(tos>=stackArray.length)
		return true;
		else
			return false;
		
	}

}
