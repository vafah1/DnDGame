package com.app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect =  false;
		
		do {
			System.out.println("Welcome to Silly D'n'D\n" + "Would you like to play as a\n" + "1. Human Wizard\n"
					+ "2. Elf Royal\n" + "3. Twi'lek Jedi\n" + "4. Smurf Warrior\n" + "5. Turtle Ninja");
			String userInput = sc.nextLine();
			switch (userInput) {
			case "1":
				//Call to humanWizard methods here
				break;
			case "2":
				//Call to elfRoyal methods
				break;
			case "3":
				//call to twilekJedi methods
				break;
			case "4":
				//call to smurfWarrior methods
				break;
			case "5":
				//Call to turtleNinja methods
				break;
			default:
				userInputCorrect = true;
				System.out.println("You've enteredd an invalid choice.\n"
						+ "1, 2, 3, 4, or 5 are your choices.\n");
				break;
			}
		} while (userInputCorrect);
	}

}
