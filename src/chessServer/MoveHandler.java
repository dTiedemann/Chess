package chessServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class MoveHandler implements HttpHandler {

	private Game game;
	
	public MoveHandler(Game game) {
		this.game = game;
	}
	
	@Override
	public void handle(HttpExchange move) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(move.getRequestBody()));
		String origin = input.readLine();
		String destination = input.readLine();
		game.handleMove(origin, destination);
	}

}
