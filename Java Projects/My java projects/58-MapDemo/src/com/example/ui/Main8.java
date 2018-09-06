package com.example.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.example.business.Circle;

public class Main8 {

	public static void main(String[] args) {

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(6);
		Circle c3 = new Circle(7);
		Circle c4 = new Circle(8);
		Circle c5 = new Circle(9);

		List<Circle> circles = new ArrayList<>();

		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		circles.add(c4);
		circles.add(c5);

		Map<String, Circle> m = new HashMap<>();

		m.put("MIN", null);
		m.put("MAX", null);

		ListIterator<Circle> it = circles.listIterator();

		while (it.hasNext()) {

			Circle c = it.next();
			if (m.get("MIN") == null) {
				m.put("MIN", c);
			} else {
				Circle t = m.get("MIN");
				if (c.getRadius() < t.getRadius()) {
					m.put("MIN", c);
				}
			}
		}
		
		while(it.hasPrevious()){
			Circle c= it.previous();
			if(m.get("MAX")==null){
				m.put("MAX", c);
			}
			else {
				Circle t = m.get("MAX");
				if (c.getRadius() > t.getRadius()) {
					m.put("MAX", c);
				}
			}

		}
		
		System.out.println(m);

	}

}
