
public class Main4 {

	public static void main(String[] args) {

		
		byte v1=56;
		short v2=60;
		int v3=80;
		long v4=90;
		double[] myArray={0.6,8.0,v1,v2,v3,v4,v1+v1,'A','a'};
		for(double d:myArray){
			System.out.println(d);
		}
		System.out.println();
		for(int i=myArray.length-1;i>=0;i--){
			
			System.out.println(myArray[i]);
		}
		
	}

}
