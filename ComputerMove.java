package JavaPrograms;
import java.util.Scanner;

public class ComputerMove{
	
	static int gameStatus;
	static int location;
	static char playerChoice=' ';
	static char computerChoice =' ';
	static int count=0;
	static int currentPlayer;
	static char[] board =CreateBoard();
	
	public static void main(String[] args) {	
		Toss();
		MakeChoice();
		System.out.println("Player selection is:"+playerChoice+"\n"+"Computer Selection is:"+computerChoice);
		DisplayBoard(board);
		makeMove(board, playerChoice,computerChoice);
		DisplayBoard(board);
		DetermineCondition(playerChoice);
		if(count==9){
			System.out.println("Game is Tie");}
		
		currentPlayer=currentPlayer%2;
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
		if (currentPlayer == 0) {
			int computerSelect=(int) Math.floor((Math.random()*10)%2);
			if (computerSelect == 0) {
				computerChoice='O';
				playerChoice ='X';
			}else {
				computerChoice='X';
				playerChoice ='O';
		}
		}else{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Choice of symbol as X or O :" );
		char userSelect=s.next().charAt(0);	
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
}

	public static void makeMove(char[] board, char playerChoice,char computerChoice){
		if(currentPlayer==1) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter location between 1 to 9" );
		location=s.nextInt();
		if (0 < location && location < 10 ) {
			if (board[location] == ' ') {
				board[location]=playerChoice;
			}
		}else{
			System.out.println("Invalid Location: Try Again"); 
			DisplayBoard(board);	
			makeMove(board, playerChoice,computerChoice);
		}
		}else{
			location=(int) Math.floor((Math.random()*9)+1);
			if (0 < location && location < 10 ) {
				if (board[location] == ' ') {
					board[location]=computerChoice;
				}
			}else{
				System.out.println("Invalid Location: Try Again"); 
				DisplayBoard(board);	
				makeMove(board, playerChoice,computerChoice);
			}
		}
		
		currentPlayer=currentPlayer+1;
	}
	
	public static int Toss() {
		int flipToss=(int) Math.floor((Math.random()*10)%2);
		if (flipToss == 0) {
			System.out.println("Player chance to play first");
			currentPlayer=1;
		}else {
			System.out.println("Computer chance to play first");
			currentPlayer=0;
		}
		return flipToss;
	}

	public static void 	DetermineCondition(char playerChoice) {
		count++;
		if (board[1] == board[2] && board[2] == board[3] && board[3]==playerChoice) {
			gameStatus=1;
		}
		else if (board[4] == board[5] && board[5] == board[6] && board[6]==playerChoice) {
			gameStatus=1;
		}
		
		else if (board[7] == board[8] && board[8] == board[9]&& board[9]==playerChoice) {
			gameStatus=1;
		}
		else if (board[1]==board[4] && board[4] == board [7]&& board[7]==playerChoice) {
			gameStatus=1;
		}
		else if (board[2]==board[5] && board[5]==board[8]&& board[8]==playerChoice) {
			gameStatus=1;
		}
		else if (board[3]==board[6] && board[6]==board[9]&& board[9]==playerChoice) {
			gameStatus=1;
		}
		else if (board[1]==board[5] && board[5]==board[9]&& board[9]==playerChoice) {
			gameStatus=1;
		}
		else if (board[3]==board[5] && board[5]==board[7]&& board[7]==playerChoice) {
			gameStatus=1;
		}else{
			gameStatus=0;
		}
		
		if(gameStatus==1){
			System.out.println("Player Wins");
		}else {System.out.println("Turn Changed");}	
	}
}