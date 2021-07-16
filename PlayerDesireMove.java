package JavaPrograms;

import java.util.Scanner;

public class PlayerDesireMove {

	static char playerChoice=' ';
	static char computerChoice =' ';
	public static void main(String[] args) {
		char[] board =CreateBoard();
		MakeChoice();
		System.out.println("Player selection is:"+playerChoice+"\n"+"Computer Selection is:"+computerChoice);		
		DisplayBoard(board);	
		makeMove(board, playerChoice);
		DisplayBoard(board);
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
		//String computerChoice ="";
		//String userChoice="";
		if (userSelect == 'X' || userSelect == 'x' ) {
			 computerChoice='O';
			 playerChoice ='X';
		}else if(userSelect == 'O' || userSelect == 'o' ){
				computerChoice='X';
				playerChoice ='O';
		}else{
		System.out.println("Invalid Selection");
		}

	}
	public static void makeMove(char[] board, char playerChoice){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter location between 1 to 9" );
		int location=s.nextInt();
		if (0 < location && location < 10 ) {
			if (board[location] == ' ') {
				board[location]=playerChoice;
			}
		}else {
			System.out.println("Invalid Location: Try Again"); 
			DisplayBoard(board);	
			makeMove(board, playerChoice);
		}
	}
}