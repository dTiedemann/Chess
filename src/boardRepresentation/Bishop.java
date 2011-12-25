package boardRepresentation;

import java.util.ArrayList;

public class Bishop extends Piece {

	/**
	 * Bishop constructor
	 * @param xLoc
	 * @param yLoc
	 */
	public Bishop(int xLoc, int yLoc)
	{
		super(xLoc, yLoc);
	}
	
	@Override
	/**
	 * returns the valid moves for a bishop from this starting position
	 */
	public ArrayList<Location> getValidMoves(Team sameTeam, Team oppositeTeam)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		
		getMovesInDirection(1,1,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(1,-1,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(-1,1,sameTeam,oppositeTeam,possibleMoves);
		getMovesInDirection(-1,-1,sameTeam,oppositeTeam,possibleMoves);
		
		return possibleMoves;
	}
}
