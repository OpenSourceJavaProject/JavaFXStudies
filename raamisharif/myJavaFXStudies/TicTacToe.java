import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TicTacToe extends Application {

	Stage window;
	Tile[][] tiles;
	String nextString;
	Pane screen;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nextString = "X";
		//Set up window
		window = primaryStage;
		window.setTitle("TicTacToe Game");
		window.setMinHeight(300);
		window.setMinWidth(300);
		
		screen = new Pane();
		
		//Create the tiles
		tiles = new Tile[3][3];
		for(int r = 0; r < 3; r++){
			for(int c = 0; c < 3; c++){
				tiles[r][c] = new Tile();
				tiles[r][c].setTranslateX(100 * c);
				tiles[r][c].setTranslateY(100 * r);
				screen.getChildren().add(tiles[r][c]);
			}
		}
		//Add the tiles to the window
		Scene myscene = new Scene(screen);
		
		window.setScene(myscene);
		window.show();
		
	}
	
	public void checkVictory(){
		for(int r = 0;  r < 3; r++){
			String tmp = tiles[r][0].getText();
			if(!tmp.equals("") && tiles[r][1].getText().equals(tmp) && tiles[r][2].getText().equals(tmp)){
				System.out.println("Victory!");
				declareWinner(r,0,r,2);
				return;
			}
		}
		
		for(int c = 0;  c < 3; c++){
			String tmp = tiles[0][c].getText();
			if(!tmp.equals("") && tiles[1][c].getText().equals(tmp) && tiles[2][c].getText().equals(tmp)){
				System.out.println("Victory!");
				declareWinner(0,c,2,c);
				return;
			}
		}
		
		String tmp = tiles[1][1].getText();
		if(tmp.equals("")) return;
		if(tiles[0][0].getText().equals(tmp) && tiles[2][2].getText().equals(tmp)){
			System.out.println("Victory"); declareWinner(0,0,2,2) ;return;
		}
		if(tiles[2][0].getText().equals(tmp) && tiles[0][2].getText().equals(tmp)){
			System.out.println("Victory"); declareWinner(2,0,0,2); return;
		}
		
	}
	
	private void declareWinner(int x1, int y1, int x2,int y2){
		Line line = new Line(tiles[x1][y1].getCenterX(),tiles[x1][y1].getCenterY(),tiles[x2][y2].getCenterX(),tiles[x2][y2].getCenterY());
		line.setStroke(Color.BLACK);
		screen.getChildren().add(line);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	class Tile extends StackPane{
		Rectangle border;
		Label text;
		public Tile(){
			super();
			border = new Rectangle(100,100);
			border.setStroke(Paint.valueOf("black"));
			border.setFill(null);
			this.setBackground(null);
			text = new Label("");
			getChildren().addAll(border, text);
			
			this.setOnMouseClicked(e -> { 
				text.setText(nextString);
				checkVictory();
				if(nextString.equals("X")) nextString = "O"; else nextString = "X";
			});
		}
		
		//Returns the text in the label for this tile
		public String getText(){
			return text.getText();
		}
		
		public double getCenterX(){
			return getTranslateX() + 50;
		}
		public double getCenterY(){
			return getTranslateY() + 50;
		}
	}

}
