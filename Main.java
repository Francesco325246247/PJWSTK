import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int My_Guess = (int) Math.floor((Math.random() * 100) + 1);
		int AI_Guess = 50;
		int Counter = 0;
		

		while (AI_Guess != My_Guess) {

			
				if (AI_Guess < My_Guess && Counter < 3) {

					AI_Guess = AI_Guess + 15;
					
				}
				if (AI_Guess > My_Guess && Counter < 3) {

					AI_Guess = AI_Guess - 15;

				}
				

				if (AI_Guess < My_Guess && Counter >= 3){

					AI_Guess = AI_Guess + 1;
					
				}
				if (AI_Guess > My_Guess && Counter >= 3) {

					AI_Guess = AI_Guess - 1;
					

				}
				
				
			Counter++;
			
			if(Counter>20){
				break;
			}
		System.out.println("The Guess number: "+Counter +" is "+ AI_Guess);
		
		}

		System.out.println("My Guess "+ My_Guess);
		if(AI_Guess == My_Guess){
		System.out.println("Done in " + Counter + " moves");}
		else{
			System.out.println("Not Done in " + Counter + " moves");
		}
	

	}
	
}

