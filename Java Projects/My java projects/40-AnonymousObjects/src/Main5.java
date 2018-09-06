
public class Main5 {

	public static void main(String[] args) {

		Integer[] values={new Integer(10),20,30};
		
		for (int i = 0; i < values.length; i++) {
			
			System.out.println(values[i]);
			
		}
		System.out.println();
		for (Integer integer : values) {
			System.out.println(integer);
		}
	}

}
