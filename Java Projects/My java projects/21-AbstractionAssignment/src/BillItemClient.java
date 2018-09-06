
public class BillItemClient {

	public static void main(String[] args) {
		
		BillItem b1;
		b1=new BillItem("mobile",12,10000.00f);
		System.out.println(b1.getDetail());
		System.out.println(b1.getValue());
	
		
	}
}
