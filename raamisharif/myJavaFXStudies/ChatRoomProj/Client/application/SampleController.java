package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class SampleController {

	public VBox messages;
	public TextArea myMessage;
	private static Socket socket;
	private static PrintWriter out;
	private static BufferedReader in;
	private static ListenToSocket mythread;
	
	public SampleController(){
		
		try {
			socket = new Socket("localhost", 4444);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mythread = new ListenToSocket();
		
		Platform.runLater(() -> mythread.start());
		
	}
	
	private class ListenToSocket extends Thread{
		
		private boolean running;
		
		public void run(){
			String fromServer = "";
			running = true;
			
			try {
				while( running && (fromServer = in.readLine()) != null){
					System.out.println("Recieved message: " + fromServer);
					Label lbl = new Label(fromServer);
					System.out.println(messages);
					Platform.runLater(() -> messages.getChildren().add(lbl));
					
				}
				
			} catch (IOException e) {
				
			}
				
		}
		
		public void exit(){
			running = false;
		}
		
	}
	
	public void submitButtonClicked(){
		
		out.println(Main.username + " : " + myMessage.getText());
		myMessage.clear();
		
	}
	
	public static void closeStreams(){
		
			mythread.exit();
		
			try {
				socket.close();
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}
}
