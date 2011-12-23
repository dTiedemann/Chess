package chessServer;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class ServerMain {

	public static HttpServer server;
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		int port;
		
		if (args.length > 1) {
			port = Integer.parseInt(args[1]);
		}
		else
		{
			port = 7777;
		}
		
		server = HttpServer.create(new InetSocketAddress("localhost", port), 0);
		server.createContext("/chess/invite/", new InviteHandler());
		
		//Spin forever
		while (true) {
			Thread.sleep(1000);
		}
	}

}
