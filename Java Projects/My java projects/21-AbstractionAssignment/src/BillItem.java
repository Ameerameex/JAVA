
public class BillItem {
	
	String productName;
	int quantity;
	float price;
	
	public BillItem(String productName, int quantity, float price) {
		
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	double getValue(){
		double value=0;
		value=quantity*price;
		return value;
	}
	
	String getDetail(){
		String value="";
		value=productName+"\t"+quantity+"\t"+price+"\t"+getValue();
		
		return value;
	}

}
