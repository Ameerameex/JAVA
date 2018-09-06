package com.ameex.training.business;

import java.util.Arrays;

public class Stack<T> {

	Object[] objects;
	int index;
	T minimum;
	T maximum;

	public Stack(int size) {
		super();
		this.objects = new Object[size];
	}

	public void push(T gen) {

		objects[index++] = gen;
		
	}

	public final T getMinimum() {
		return minimum;
	}

	

	public final T getMaximum() {
		return maximum;
	}

	

	public T pop() {
		T temp;
		index--;
		temp = (T) objects[index];
		

		

		
		return temp;
	}

	@Override
	public String toString() {
		
		String string="[Stack : ";
		StringBuffer buffer=new StringBuffer();
		for (int i = 0; i <index; i++) {
			String string2=objects[i].toString();
			buffer.append(string2);
			buffer.append(",");
		}
		
		string=string+buffer.toString()+ "]";
		return string;
		
	}

	public int getCapacity() {

		return objects.length;
	}

	public int getSize() {

		return index;
	}
}
