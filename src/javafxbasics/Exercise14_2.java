/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:56:50 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Class Exercise14_2
 * @author 
 */
public class Exercise14_2 extends Application {

  @Override
  public void start(Stage primaryStage) {
    Pane pane = new Pane();
    Image image = new Image("images/x.gif");
    pane.getChildren().add(new ImageView(image));
    
    primaryStage.setScene(new Scene(pane, 200, 200));
    primaryStage.show();
  }

}
