package com.ameex.training.ui;

import com.ameex.training.business.Circle;
import com.ameex.training.business.Stack;

public class Main {

	public static void main(String[] args) {

		Stack circleStack = new Stack(10);

		System.out.println(circleStack.getCapacity());
		System.out.println(circleStack.getSize());
		System.out.println(circleStack);

		Circle circle = new Circle(10);
		Circle circle2 = new Circle(15);
		Circle circle3 = new Circle(6);
		Circle circle4 = new Circle(21);
		Circle circle5 = new Circle(8);

		circleStack.push(circle);
		circleStack.push(circle2);
		circleStack.push(circle3);
		circleStack.push(circle4);
		circleStack.push(circle5);
		System.out.println(circleStack.getCapacity());
		System.out.println(circleStack.getSize());

		System.out.println(circleStack.getMinimum());
		System.out.println(circleStack.getMaximum());
		System.out.println(circleStack);


		System.out.println(circleStack.pop());
		System.out.println(circleStack.pop());
		System.out.println(circleStack);

		System.out.println(circleStack.getMinimum());
		System.out.println(circleStack.getMaximum());
		circleStack.pop();
		circleStack.pop();
		circleStack.pop();
		System.out.println(circleStack.getCapacity());
		System.out.println(circleStack.getSize());
		System.out.println(circleStack.getMinimum());
		System.out.println(circleStack.getMaximum());

	}

}
