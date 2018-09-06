
public class SortArrayElements {

	public static void main(String[] args) {
		
		int[] marksScored={34, 17, 22, 31, 30, 44, 28};
		
		/*
		 * Write code here to sort the above array in ascending order
		 */
		
		for (int i = 0; i < marksScored.length; i++) {
			
			
			for (int j = i+1; j < marksScored.length; j++) {
				
				if(marksScored[i]>marksScored[j]){
				
				int temp=marksScored[i];
				marksScored[i]=marksScored[j];
				marksScored[j]=temp;
				
			}
			
			
		}
		}
		/*
		 * Write code here to print the array elements
		 */
		for (int k = 0; k < marksScored.length; k++) {
			
			System.out.print(marksScored[k]+" ");
		}
		

	}

}
