
public class MinFinder {

	public static void main(String[] args) {
		int[] quantities = { 10, 4, 5, 6, 8, 9, 14, 17, 34 };
int min=0;
		// Write code to compute the minimum value amongst the elements of the above array

		// Write code here to print the computed minimum value
min=quantities[0];
		for (int i = 1; i < quantities.length; i++) {
			
			
			if(min>quantities[i]){
				min=quantities[i];
			}
			
		}
System.out.println("minimum value :"+min);
	}

}
