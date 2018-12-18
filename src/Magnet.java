import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


/**
 * This car implements the magnets which is used to attract other balls in a given range
 * @author NAMAN
 * this Magnet's ImageView
 *
 */
public class Magnet extends token {
//	Pane pane = new Pane();
	ImageView view;

	/**
	 * This returns the ImageView of the magnet
	 * @return
	 * returns the imageview of the magnet
	 */
	public ImageView generateMagnet() {
		/* Function generateMagnet
		 * returns ImageView
		 * Takes no parameter
		 * Description
		 * 		Generates Magnet feature for the game
		 */
		Random num = new Random();
		int x_cor = this.get_random_x_coordinate();
		int y_cor = this.get_random_y_coordinate();
		Image img_magnet = null;
		InputStream in_magnet = null;
		try{
			in_magnet = Files.newInputStream(Paths.get("res/images/Magnet.png"));
			img_magnet = new Image(in_magnet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in_magnet.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		view = new ImageView(img_magnet);
		view.setFitWidth(40);
		view.setFitHeight(40);
		view.setX(x_cor);
		view.setY(y_cor);
		return view;
//		pane.getChildren().add(view);
	}
}