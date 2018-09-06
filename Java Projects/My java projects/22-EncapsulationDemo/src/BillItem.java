
public class BillItem {
	
	 private String productName;
private	int quantity;
	private float price;
	
	  BillItem() {
		
	}

	 BillItem(String productName, int quantity, float price) {
		
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	String getProductName() {
		return productName;
	}

	 void setProductName(String productName) {
		this.productName = productName;
	}

	 int getQuantity() {
		return quantity;
	}

	 void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	 float getPrice() {
		return price;
	}

	 void setPrice(float price) {
		this.price = price;
	}

	double getValue(){
		double value=0;
		value=quantity*price;
		return value;
	}
	
	String getDetail(){
		String value=null;
		value=productName+"\t"+quantity+"\t"+price+"\t"+getValue();
		
		return value;
	}

}
