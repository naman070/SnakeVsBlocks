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
 * This class implements the destroyer token
 * @author NAMAN
 *
 */
public class Destroyer extends token {
//	Pane pane = new Pane();
	ImageView view;

	/**
	 * This returns the ImageView of this destroyer 
	 * @return
	 * this destroy's ImageView
	 */
	public ImageView generateDestroyer() {
		Random num = new Random();
		int x_cor = this.get_random_x_coordinate();
		int y_cor = this.get_random_y_coordinate();
		Image img_destroyer = null;
		InputStream in_destroyer = null;
		try{
			in_destroyer = Files.newInputStream(Paths.get("res/images/destroy.jpg"));
			img_destroyer = new Image(in_destroyer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in_destroyer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		view = new ImageView(img_destroyer);
		view.setFitWidth(40);
		view.setFitHeight(40);
		view.setX(x_cor);
		view.setY(y_cor);
		return view;
//		pane.getChildren().add(view);
	}
}