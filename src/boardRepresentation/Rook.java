package boardRepresentation;

import java.util.ArrayList;

public class Rook extends Piece{

	/**
	 * creates a new rook
	 * @param xLoc
	 * @param yLoc
	 */
	public Rook(int xLoc, int yLoc)
	{
		super(xLoc, yLoc);
	}
	
	@Override
	/**
	 * returns the valid moves for a rook from this starting position
	 */
	public ArrayList<Location> getValidMoves(Team sameTeam, Team oppositeTeam)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		getMovesInDirection(1,0,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(-1,0,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(0,1,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(0,-1,sameTeam,oppositeTeam,possibleMoves);
		return possibleMoves;
	}
}
