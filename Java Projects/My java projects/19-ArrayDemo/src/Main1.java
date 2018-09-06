
public class Main1 {

	public static void main(String[] args) {

		float[] marks;
		marks=new float[4];
		System.out.println(marks);
		marks[0]=85.9f;
		marks[1]=83.9f;
		marks[2]=81.9f;
		marks[3]=87.9f;
		System.out.println("size of the array is :"+marks.length);
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
			
			
		}
marks=null;
		
	}

}
