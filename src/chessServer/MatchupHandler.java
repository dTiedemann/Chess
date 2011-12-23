package chessServer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public abstract class MatchupHandler implements HttpHandler {

	static LinkedList<Invitation> invites;
	static LinkedList<Game> games;
	
	
	@Override
	public void handle(HttpExchange seek) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(seek.getRequestBody()));
		String invitee = input.readLine();
		String inviter = input.readLine();
		
		String reply = handleInvitation(new Invitation(invitee, inviter));
		
		OutputStreamWriter osw = new OutputStreamWriter(seek.getResponseBody());
		osw.write(reply);
		osw.flush();
	}
	
	protected abstract String handleInvitation(Invitation inv);
}
