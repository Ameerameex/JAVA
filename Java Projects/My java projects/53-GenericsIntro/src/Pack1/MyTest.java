package Pack1;

public class MyTest<T> {
	
	@Override
	public String toString() {
		return "MyTest [getObject()=" + getObject() + "]";
	}

	T object;

	public final T getObject() {
		return (T) object;
	}

	public final void setObject(T object) {
		this.object = object;
	}
	
	
	

	
}
