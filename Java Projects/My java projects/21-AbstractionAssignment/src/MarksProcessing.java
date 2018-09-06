
public class MarksProcessing {
	
	int[] allMarks=new int[5];
	int index;
	
	
	void addMark(int mark){
		if (mark <= 0) {
			System.out.println("Invalid Input value - Input value should be a positive number");
			System.out.println("Please Try Again...!!!");
		} else {
			
			allMarks[index]=mark;
			
		index++;
		}
	}
	
	int getMaximum(){
		int max=allMarks[0];
		for (int i = 1; i < allMarks.length; i++) {
			
			if(max<allMarks[i]){
				max=allMarks[i];
				
			}
		}
		
		
		return max;
	}
	
	int getMinimum(){
		
		int min=allMarks[0];
		for (int i = 1; i < allMarks.length; i++) {
			
			if(min>allMarks[i]){
				min=allMarks[i];
				
			}
		}
		
		
		return min;
	}
	
	int getTotal(){
		int total=0;
		
		for (int i = 0; i < allMarks.length; i++) {
			
			total+=allMarks[i];
			
		}
		return total;
	}
	
	int getAverage(){
		int avg=getTotal()/allMarks.length;
		
		return avg;
	}
	
	int count(){
		
		return index;
	}
	
	void printDetail(){
		System.out.println("MAX NUMBER      MIN NUMBER      TOTAL       AVERAGE           COUNT OF NUMBERS");
		System.out.println( getMaximum()+"\t\t"+getMinimum()+"\t\t"+ getTotal()+"\t\t"+getAverage()+"\t\t"+count());
		
	}

	

}
