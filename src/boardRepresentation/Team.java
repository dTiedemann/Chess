package boardRepresentation;

import java.util.ArrayList;

public class Team {

	private ArrayList<Piece> pieces;
	
	/**
	 * creates an empty team
	 */
	public Team()
	{
		pieces = new ArrayList<Piece>();
	}
	
	/**
	 * Adds a piece to the team
	 * @param p
	 */
	public void addPiece(Piece p)
	{
		pieces.add(p);
	}
	
	/**
	 * returns whether or not there is a piece at this location
	 * @param l
	 * @return
	 */
	public boolean containsPieceOnLocation(Location l)
	{
		for(Piece p : pieces)
		{
			if(p.getLocation().equals(l))
			{
				return true;
			}
		}
		return false;
	}
}
