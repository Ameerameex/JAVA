
public class Processing {
	
  private int x,y;
  static int z;

 int getX() {
	return this.
			x;
}

 void setX(int x) {
	this.x = x;
}

 int getY() {
	 
	return y;
}

 

void setY(int y) {
	this.y = y;
	this.setX(y);
	printZ();
	System.out.println(x);
	System.out.println(z);
	new Processing();
}

static void printZ(){
	System.out.println(z);
	
	
	
	System.out.println(z);
	new Processing();
}

static void test(int g){
	
	System.out.println(g*g);
	
}
Processing(int x, int y) {
	this();
	this.x = x;
	this.y = y;
}

 public Processing() {
	this.setX(y);
	
	System.out.println(this.x);
	System.out.println(z);
	
}
	

}
