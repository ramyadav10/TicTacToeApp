package JavaPrograms;

public class CreatingBoard {

	public static void main(String[] args) {
		char[] board =CreateBoard();
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
}
