package boardRepresentation;

import java.util.ArrayList;

public class Knight extends Piece {

	/**
	 * creates a new knight
	 * @param xLoc
	 * @param yLoc
	 */
	public Knight(int xLoc, int yLoc)
	{
		super(xLoc, yLoc);
	}
	
	@Override
	/**
	 * returns the valid moves for a knight from this starting position
	 */
	public ArrayList<Location> getValidMoves(Team sameTeam, Team oppositeTeam)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		
		//enumerate all possible knight moves
		possibleMoves.add(new Location(l.getX()+1,l.getY()+2));
		possibleMoves.add(new Location(l.getX()+1,l.getY()-2));
		possibleMoves.add(new Location(l.getX()-1,l.getY()+2));
		possibleMoves.add(new Location(l.getX()-1,l.getY()-2));
		possibleMoves.add(new Location(l.getX()+2,l.getY()+1));
		possibleMoves.add(new Location(l.getX()+2,l.getY()-1));
		possibleMoves.add(new Location(l.getX()-2,l.getY()+1));
		possibleMoves.add(new Location(l.getX()-2,l.getY()-1));
	
		//remove invalid moves
		for(Location l : possibleMoves)
		{
			if(!l.isValid() || sameTeam.containsPieceOnLocation(l))
			{
				possibleMoves.remove(l);
			}
		}
		
		return possibleMoves;
	}
}
