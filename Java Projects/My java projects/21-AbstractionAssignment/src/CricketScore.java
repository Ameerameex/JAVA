
public class CricketScore {
	
	String batsmanName;
	int score;
	int noOfSingles,noOfTwos, noOfThrees, noOfFours,noOfSixes,noOfDotBalls;
	int noOfBallsFaced;
	
	void oneRun(){
		
		score+=1;
		noOfSingles++;
		noOfBallsFaced++;
		
	}
	
	void twoRuns(){
		score+=2;
		noOfTwos++;
		noOfBallsFaced++;
	}
	
	void threeRuns(){
		score+=3;
		noOfThrees++;
		noOfBallsFaced++;
		
		
		
	}
	
	void four(){
		
		score+=4;
		noOfFours++;
		noOfBallsFaced++;
		
	}
	
	void six(){
		
		score+=6;
		noOfSixes++;
		noOfBallsFaced++;
		
	}
	
	void dotBall(){
		
		noOfDotBalls++;
		noOfBallsFaced++;
		
	}
	
	String getDetails(){
		String outStr=null;
		// Implement Code here to concatenate all the details
		
		outStr=batsmanName+"\t\t"+score+"\t\t"+noOfDotBalls+"\t\t"+noOfSingles+"\t\t"+noOfTwos+"\t\t"+noOfThrees+"\t\t"+noOfFours+"\t\t"+noOfSixes+"\t\t"+noOfBallsFaced;
				
		return outStr;
	}
	
	double getStrikeRate(){
		double strikeRate=0;
		
		strikeRate=(score/noOfBallsFaced)*100;
		
		return strikeRate;
	}
	

}
