import javafx.animation.AnimationTimer;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.geometry.Point2D;

import java.io.Serializable;
import java.util.*;


/**
 * this class implements the properties of the player
 * @author NAMAN
 *
 */
class Sprite extends Circle implements Serializable {
	boolean dead = false;
	final String type;
	/**
	 * constructs a snake ball
	 * @param x x-coordinates of this object
	 * @param y y-coordinates of this object
	 * @param r radius of this object
	 * @param type type of this object	 *
	 * @param color color of the object
	 */
	Sprite(int x,int y,int r, String type,Color color){
		super(r,color);
		this.type = type;
		setTranslateX(x);
		setTranslateY(y);
	}
	/**
	 * use to move player in the left direction
	 */
	void moveLeft(){
		setTranslateX(getTranslateX()-30);			
	}
	/**
	 * use to move player in the right direction
	 */
	void moveRight(){
		setTranslateX(getTranslateX()+30);
	}
}

/**
 * implements a snake 
 * @author NAMAN
 *
 */
public class Snake implements Serializable {
	private Pane root = new Pane();
	private Sprite player;
	private ArrayList<Sprite> snake = new ArrayList<>();
	private Text len;
	
	/**
	 * 
	 * @return
	 * returns the length in text format
	 */
	public Text getlen() {
		return len;
	}
	
	/**
	 * sets the length
	 * @param length take length as parameter
	 */
	public void setlen(int length) {
		len.setText(Integer.toString(length));
	}
	
	/**
	 * create all the contents of the snake i.e player
	 * @param root root of the main pane is required
	 * @return
	 * returns the updated pane in which all the contents are added
	 */
	public Pane createContent(Pane root){
		root.setPrefSize(600,800);
		int x=15;
		if(snake.size()!=0) {
			for(int i=0;i<snake.size();i++){
				player = new Sprite(300,600+(2*x),15,"snake",Color.BLUE);
				root.getChildren().add(player);
				x = x+15;
				snake.add(player);
			}
		}else {
			for(int i=0;i<5;i++){
				player = new Sprite(300,600+(2*x),15,"snake",Color.BLUE);
				if(i==4) {
					len=new Text(Integer.toString(snake.size()));
					len.setFont(new Font(20));
					len.setX(snake.get(0).getTranslateX()-5);
					len.setY(snake.get(0).getTranslateY());
					root.getChildren().add(len);
				}
				root.getChildren().add(player);
				x = x+15;
				snake.add(player);
			}
		}
		return root;
	}public Pane createContentres(Pane root,int length) {
		root.setPrefSize(600,800);
		int x=15;
		for(int i=0;i<length+1;i++){
			Sprite p = new Sprite(300,600+(2*x),15,"snake",Color.BLUE);
			root.getChildren().add(p);
			x = x+15;
			snake.add(p);
		}
		len=new Text(Integer.toString(snake.size()));
		len.setFont(new Font(20));
		len.setX(snake.get(0).getTranslateX()-5);
		len.setY(snake.get(0).getTranslateY());
		root.getChildren().add(len);
		return root;
	}
	public ArrayList<Sprite> getSnake(){
		return snake;
	}

}