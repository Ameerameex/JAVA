package xfnvcghg;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
        int sum1=0;
        int sum2=0;
        int p1=0;
        int p2=0;
		String player1;
		String player2;
		String color1;
		String color2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the player1 name :");
		player1=sc.next();
		System.out.println("choose the color for player1: ");
		color1=sc.next();
		System.out.println("enter the player2 name :");
		player2=sc.next();
		System.out.println("choose the color for player2: ");
		color2=sc.next();
		System.out.println("Let's play");
		
		while(sum1<=50){
		System.out.println(player1 + "Roll the dice");
		
		p1=rand.nextInt(9);
		System.out.println(p1);
		if(sum1==0 && p1==6){
			 sum1=sum1+p1;
		}
		else if(sum1>0){
			sum1=sum1+p1;
		}
		System.out.println("position : " + sum1);
		}
		
		while(sum1<=50){
			System.out.println(player2 + "Roll the dice");
			
			p2=rand.nextInt(9);
			System.out.println(p2);
			if(sum2==0 && p2==6){
				 sum2=sum2+p2;
			}
			else if(sum2>0){
				sum2=sum2+p2;
			}
			System.out.println("position : " + sum1);
			}

		
	}

}

	
