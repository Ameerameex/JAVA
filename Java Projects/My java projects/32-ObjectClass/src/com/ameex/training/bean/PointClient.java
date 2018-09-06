package com.ameex.training.bean;

public class PointClient {
	
	public static void main(String[] args) throws Throwable {
		
		Point point=new Point(10, 20);
		Point point2=new Point(10, 20);
		Point point3=new Point(10, 30);
		System.out.println(point.equals(point2));
		System.out.println(point.equals(point3));
		System.out.println(point);
		System.out.println(point2);
		System.out.println(point3);
		Point point4=point;
		point=null;
		point2=null;
		point3=null;
		System.gc();
		System.out.println(point);
		System.out.println(point4);


	}

}
