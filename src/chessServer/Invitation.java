package chessServer;

public class Invitation {

	private String invitee;
	private String inviter;
	
	public Invitation(String invitee, String inviter){
		this.invitee = invitee;
		this.inviter = inviter;
	}
	
	public String getInvitee() {
		return invitee;
	}
	
	public String getInviter() {
		return inviter;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Invitation)
		{
			Invitation inv = (Invitation) obj;
			return invitee.equals(inv.getInvitee()) && inviter.equals(inv.getInviter());
		}
		else
		{
			return false;
		}
	}
}
