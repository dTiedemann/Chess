package chessServer;

public class InviteHandler extends MatchupHandler {

	@Override
	protected String handleInvitation(Invitation inv) {
		invites.add(inv);
		return "Invitation has been sent";
	}
}
