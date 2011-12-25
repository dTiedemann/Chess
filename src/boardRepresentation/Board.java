package boardRepresentation;
import java.util.ArrayList;

public class Board {

	private ArrayList<Piece> whitePieces;
	private ArrayList<Piece> blackPieces;
	
	/**
	 * Creates the board and initializes the pieces to their correct Locations
	 */
	public Board()
	{
		whitePieces = new ArrayList<Piece>();
		blackPieces = new ArrayList<Piece>();
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
			whitePieces.add(new Pawn(1,i));
			blackPieces.add(new Pawn(6,i));
		}
		
		//create the rooks
		whitePieces.add(new Rook(0,0));
		whitePieces.add(new Rook(0,7));
		blackPieces.add(new Rook(7,0));
		blackPieces.add(new Rook(7,7));
		
		//create the knights
		whitePieces.add(new Knight(0,1));
		whitePieces.add(new Knight(0,6));
		blackPieces.add(new Knight(7,1));
		blackPieces.add(new Knight(7,6));
		
		//create the bishops
		whitePieces.add(new Bishop(0,2));
		whitePieces.add(new Bishop(0,5));
		blackPieces.add(new Bishop(7,2));
		blackPieces.add(new Bishop(7,5));
		
		//creates the queens
		whitePieces.add(new Queen(0,3));
		blackPieces.add(new Queen(7,3));
		
		//creates the kings
		whitePieces.add(new King(0,4));
		blackPieces.add(new King(7,4));
	}
}
