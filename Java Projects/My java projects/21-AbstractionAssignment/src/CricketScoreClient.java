import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class CricketScoreClient {

	public static void main(String[] args) {

		CricketScore cricketScore = new CricketScore();

		cricketScore.batsmanName = "Suriya";
		int r = 1;
		Scanner scanner = new Scanner(System.in);
		while (r <= 12) {
			int run = scanner.nextInt();
			switch (run) {
			case 0:
				cricketScore.dotBall();
				break;
			case 1:
				cricketScore.oneRun();
				break;
			case 2:
				cricketScore.twoRuns();
				break;
			case 3:
				cricketScore.threeRuns();
				break;
			case 4:
				cricketScore.four();
				break;
			case 6:
				cricketScore.six();
				break;
			default:
				System.out.println("enter A  valid data");

			}
			r++;
		}
		System.out.println(cricketScore.batsmanName);
		System.out.println(cricketScore.getDetails());
		System.out.println(cricketScore.getStrikeRate());
	}

}
