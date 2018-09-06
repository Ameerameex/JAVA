
public class BillItemClient {

	public static void main(String[] args) {
		
		BillItem b1;
		b1=new BillItem();
		b1.setProductName("mobile");
		b1.setPrice(12000);
		b1.setQuantity(5);
		
		System.out.println(b1.getProductName());
		System.out.println(b1.getPrice());
		System.out.println(b1.getQuantity());
		System.out.println(b1.getDetail());
		System.out.println(b1.getValue());
		
		
	}
}
