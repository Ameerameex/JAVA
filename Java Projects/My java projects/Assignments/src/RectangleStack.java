

public class RectangleStack {

	/*Rectangle[] rectangles;
	int index;
	Rectangle minimum;
	Rectangle maximum;

	public RectangleStack(int size) {
		super();
		this.rectangles = new Rectangle[size];
	}

	public void push(Rectangle rectangle) {

		rectangles[index++] = rectangle;
		if (minimum == null) {
			minimum = rectangle;
		} else {
			int r = minimum.compareTo(rectangle);
			if (r > 0) {
				minimum = rectangle;
			}
		}
		if (maximum == null) {
			maximum = rectangle;
		} else {
			int r = maximum.compareTo(rectangle);
			if (r < 0) {
				maximum = rectangle;
			}
		}
	}

	public final Rectangle getMinimum() {
		return minimum;
	}

	public final void setMinimum(Rectangle minimum) {
		this.minimum = minimum;
	}

	public final Rectangle getMaximum() {
		return maximum;
	}

	public final void setMaximum(Rectangle maximum) {
		this.maximum = maximum;
	}

	public Rectangle pop() {
		Rectangle temp;
		index--;
		temp = rectangles[index];

		if (index >0) {
			minimum = rectangles[0];

			for (int i = 0; i < index; i++) {
				int r = rectangles[i].compareTo(minimum);
				if (r <0) {
					minimum = rectangles[i];
				}
			}
		} else {
			minimum = null;
		}

		if (index > 0) {
			maximum = rectangles[0];

			for (int i = 0; i < index; i++) {
				int r = rectangles[i].compareTo(maximum);
				if (r > 0) {
					maximum = rectangles[i];
				}
			}
		} else {
			maximum = null;
		}
		return temp;
	}

	@Override
	public String toString() {
		
		String string="[Stack : ";
		StringBuffer buffer=new StringBuffer();
		for (int i = 0; i <index; i++) {
			String string2=rectangles[i].toString();
			buffer.append(string2);
			buffer.append(",");
		}
		
		string=string+buffer.toString()+ "]";
		return string;
		
	}

	public int getCapacity() {

		return rectangles.length;
	}

	public int getSize() {

		return index;
	}*/
}
