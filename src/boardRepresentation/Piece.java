package boardRepresentation;
import java.util.ArrayList;

public class Piece {
	
	protected Location l; //where the piece is currently
	
	/**
	 * creates a new piece at this location
	 * @param xLoc
	 * @param yLoc
	 */
	public Piece(int xLoc, int yLoc)
	{
		l = new Location(xLoc, yLoc);
	}

	/**
	 * returns the location of this piece
	 * @return
	 */
	public Location getLocation()
	{
		return l;
	}
	
	/**
	 * Returns a list of all valid movements
	 * @param sameTeam
	 * @param oppositeTeam
	 * @return
	 */
	public ArrayList<Location> getValidMoves(Team sameTeam, Team oppositeTeam)
	{
		return null;
	}
	
	/**
	 * Determines if this piece can move to a valid location
	 * @param l
	 * @param sameTeam
	 * @param otherTeam
	 * @return
	 */
	public boolean isValidMove(Location l, Team sameTeam, Team otherTeam)
	{
		return getValidMoves(sameTeam, otherTeam).contains(l);
	}
	
	/**
	 * will get as many moves as possible in a consistent direction.
	 * @param xIncr
	 * @param yIncr
	 * @param sameTeam
	 * @param oppositeTeam
	 * @param possibleMoves
	 * @return
	 */
	protected ArrayList<Location> getMovesInDirection(int xIncr, int yIncr, Team sameTeam, Team oppositeTeam, ArrayList<Location>possibleMoves)
	{
		boolean canStillMove = true;
		Location currLoc = new Location(l.getX(), l.getY());
		while(canStillMove)
		{
			currLoc = new Location(currLoc.getX()+xIncr, currLoc.getY()+yIncr);
			if(!currLoc.isValid() || sameTeam.containsPieceOnLocation(currLoc))
			{
				canStillMove = false;
			}
			else
			{
				possibleMoves.add(currLoc);
				if(oppositeTeam.containsPieceOnLocation(currLoc))
				{
					canStillMove = false;
				}
			}
		}
		return possibleMoves;
	}
}
