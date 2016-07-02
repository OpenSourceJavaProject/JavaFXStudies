import java.io.IOException;
import java.net.ServerSocket;

public class MultiServer {

	
	
	public static void main(String[] args) throws IOException {

	        int portNumber = 4444;
	        
	        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
	            while (true) {
		            new MultiServerThread(serverSocket.accept()).start();
		        }
		    } catch (IOException e) {
	            System.err.println("Could not listen on port " + portNumber);
	            System.exit(-1);
	        }
	    }
}
