
public class InvoiceClient {

	public static void main(String[] args) {
		
		Invoice invoice=new Invoice();
		System.out.println(invoice.getTotal());
		System.out.println(invoice.getTotalDiscount());
		invoice.printInvoice();
		

	}

}
