import java.io.PrintWriter;
import java.util.ArrayList;

public class ChatProtocol {

	private static ArrayList<PrintWriter> writers;
	
	public static synchronized void addWriter(PrintWriter w){
		if(writers == null)
			writers = new ArrayList<>();
		
		submitMessage("A new Writer has joined");
		
		w.println("Welcome to the Chat Room!");
		
		writers.add(w);
		
	}
	
	public static synchronized void removeWriter(PrintWriter w){
		writers.remove(w);
		submitMessage("A Writer has left");
	}
	
	public static synchronized void submitMessage(String s){
		writers.forEach(w -> w.println(s));
	}
	
}
