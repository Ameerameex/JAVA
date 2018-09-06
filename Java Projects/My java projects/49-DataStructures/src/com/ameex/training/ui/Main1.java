package com.ameex.training.ui;

import com.ameex.training.business.Circle;

import com.ameex.training.business.Rectangle;

import com.ameex.training.business.Stack;

public class Main1 {

	public static void main(String[] args) {

		Stack<Circle> stack = new Stack<>(10);

		stack.push(new Circle(5));
		stack.push(new Circle(7));
		stack.push(new Circle(3));
		stack.push(new Circle(2));

		System.out.println(stack);

		Circle c1 = stack.pop();
		Circle c2 = stack.pop();
		Circle c3 = stack.pop();
		Circle c4 = stack.pop();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println(stack);

		Stack<Rectangle> stack2 = new Stack<>(10);
		stack2.push(new Rectangle(20, 5));
		stack2.push(new Rectangle(22, 6));
		stack2.push(new Rectangle(24, 7));
		stack2.push(new Rectangle(26, 9));

		System.out.println(stack2);

		Rectangle rectangle1 = stack2.pop();
		Rectangle rectangle2 = stack2.pop();
		Rectangle rectangle3 = stack2.pop();
		Rectangle rectangle4 = stack2.pop();

		System.out.println(rectangle1);
		System.out.println(rectangle2);

		System.out.println(rectangle3);

		System.out.println(rectangle4);

		System.out.println(stack2);

		Stack<Integer> stack3 = new Stack<>(10);

		stack3.push(new Integer(1));
		stack3.push(new Integer(2));
		stack3.push(new Integer(3));
		stack3.push(new Integer(4));

		System.out.println(stack3);

		Integer i1 = stack3.pop();
		Integer i2 = stack3.pop();
		Integer i3 = stack3.pop();
		Integer i4 = stack3.pop();

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		System.out.println(stack3);
		/*
		 * stack4=double; stack5=boolean;
		 */
		Stack<Double> stack4 = new Stack<>(10);
		stack4.push(new Double(3.14));
		stack4.push(new Double(6.14));
		stack4.push(new Double(9.14));
		stack4.push(new Double(12.14));

		System.out.println(stack4);

		Double d1 = stack4.pop();
		Double d2 = stack4.pop();
		Double d3 = stack4.pop();
		Double d4 = stack4.pop();

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		System.out.println(stack4);

		Stack<Boolean> stack5 = new Stack<>(10);

		stack5.push(new Boolean(true));
		stack5.push(new Boolean(false));
		stack5.push(new Boolean(true));
		stack5.push(new Boolean(false));

		System.out.println(stack5);

		Boolean b1 = stack5.pop();
		Boolean b2 = stack5.pop();
		Boolean b3 = stack5.pop();
		Boolean b4 = stack5.pop();

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		System.out.println(stack5);
		
		Stack<Float> stack6;
		
		
		Stack stack7;
		
		stack7=new Stack<>(5);
		
		stack7.push(new Integer(10));
		stack7.push(200.00);
		stack7.push(new Circle(5));
		System.out.println(stack7);
		Object o1=stack7.pop();
		Object o2=stack7.pop();
		Object o3=stack7.pop();
		



	}

}
