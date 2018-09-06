package com.example.business;

public class A {

	private int x,y;
	
	

	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	
	}
	public void test2(){
		B obj= new B(10);
		System.out.println(obj.z);
		obj.test();
	}
	 private B obj;
	 private class B{
			
			private int z;

			public B(int z) {
				super();
				this.z = z;
			}
			public void test(){
				
				System.out.println(x+y);
				System.out.println(z);

			}
			
		}

	
}
