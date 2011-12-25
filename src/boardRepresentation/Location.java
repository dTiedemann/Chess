package boardRepresentation;

public class Location {

	private int x;
	private int y;
	
	/**
	 * Creates a new location with x and y coordinates
	 * @param xLoc
	 * @param yLoc
	 */
	public Location(int xLoc, int yLoc)
	{
		this.x = xLoc;
		this.y = yLoc;
	}
	
	/**
	 * returns the x coordinate
	 * @return
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * returns the y coordinate
	 * @return
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * sets the x coordinate
	 */
	public void setX(int newX)
	{
		x = newX;
	}
	
	/**
	 * sets the y coordinate
	 * @param newY
	 */
	public void setY(int newY)
	{
		y = newY;
	}
	
	/**
	 * determines if two locations are the same
	 * @param l1
	 * @return
	 */
	public boolean equals(Location l1)
	{
		return (l1.getX() == x) && (l1.getY() == y);
	}
}
