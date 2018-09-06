
public class B extends A{
  int z;
	public B() {
		super();
		System.out.println("B constructor");
	}
	B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	B(int z) {
		super();
		this.z = z;
	}

}
