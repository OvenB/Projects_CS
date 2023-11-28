package responsi_uts;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		char input;
		Board bl = new Board(6);
		Scanner scan = new Scanner(System.in);
		
		
		while(bl.currGold >0) {
			System.out.println("Gold to collect: " + bl.currGold);
			bl.displayBoard();
			System.out.print("input move: ");
			input = scan.nextLine() .toLowerCase() .charAt(0);
			bl.move(input);
		}
		

		
		
		
	}
	
	
}
