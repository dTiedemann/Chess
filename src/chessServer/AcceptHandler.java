package chessServer;

public class AcceptHandler extends MatchupHandler {

	private int gameID = 0;
	
	@Override
	protected synchronized String handleInvitation(Invitation inv) {
		if (invites.contains(inv))
		{
			invites.remove(inv);
			Game g = new Game();
			games.add(g);
			ServerMain.server.createContext("/chess/" + gameID + "/move/", new MoveHandler(g));
			gameID++;
			return "Invitation Accepted";
		}
		else
		{
			return "You did not receive this invitation";
		}
	}


}
