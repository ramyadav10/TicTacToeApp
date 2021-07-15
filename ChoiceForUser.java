package JavaPrograms;

import java.util.Scanner;

public class ChoiceForUser {

	public static void main(String[] args) {
		char[] board =CreateBoard();
		MakeChoice();
		//DisplayBoard(board);	
	}

	public static char[] CreateBoard() {
		char[] board=new char[10];
				
		for(int i=1; i<board.length;i++) {
			board[i]=' ';
		}	
		return board;
	}
	public static void DisplayBoard(char[] board) {
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("-----");	
		System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println("-----");	
		System.out.println(board[7]+"|"+board[8]+"|"+board[9]);	
	}
	public static void MakeChoice() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Choice of symbol as X or O :" );
		char userSelect=s.next().charAt(0);
		char computerChoice =' ';
		char userChoice=' ';
		if (userSelect == 'X' || userSelect == 'x' ) {
			computerChoice='O';
			userChoice ='X';			
		}else if(userSelect == 'O' || userSelect == 'o' ){
				computerChoice='X';
				userChoice ='O';
		}else{
		System.out.println("Invalid Selection");
	}
		System.out.println(userChoice+ "  "+computerChoice);
}
}