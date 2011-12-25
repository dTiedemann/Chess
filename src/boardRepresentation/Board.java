package boardRepresentation;
import java.util.ArrayList;

public class Board {

	private Team whitePieces;
	private Team blackPieces;
	
	/**
	 * Creates the board and initializes the pieces to their correct Locations
	 */
	public Board()
	{
		whitePieces = new Team();
		blackPieces = new Team();
		initializeBoard();
	}
	
	/**
	 * this will the pieces of each team
	 */
	private void initializeBoard()
	{
		//create the pawns
		for(int i=0; i<8; i++)
		{
			whitePieces.addPiece(new Pawn(1,i));
			blackPieces.addPiece(new Pawn(6,i));
		}
		
		//create the rooks
		whitePieces.addPiece(new Rook(0,0));
		whitePieces.addPiece(new Rook(0,7));
		blackPieces.addPiece(new Rook(7,0));
		blackPieces.addPiece(new Rook(7,7));
		
		//create the knights
		whitePieces.addPiece(new Knight(0,1));
		whitePieces.addPiece(new Knight(0,6));
		blackPieces.addPiece(new Knight(7,1));
		blackPieces.addPiece(new Knight(7,6));
		
		//create the bishops
		whitePieces.addPiece(new Bishop(0,2));
		whitePieces.addPiece(new Bishop(0,5));
		blackPieces.addPiece(new Bishop(7,2));
		blackPieces.addPiece(new Bishop(7,5));
		
		//creates the queens
		whitePieces.addPiece(new Queen(0,3));
		blackPieces.addPiece(new Queen(7,3));
		
		//creates the kings
		whitePieces.addPiece(new King(0,4));
		blackPieces.addPiece(new King(7,4));
	}
}
