/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:56:50 PM 
 */

package javafxbasics;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Class Exercise14_2
 * @author 
 */
public class Exercise14_2 extends Application {

  @Override
  public void start(Stage primaryStage) {
    //Pane pane = new Pane();
    //int R = (int)Math.random()*8;
    
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setPadding(new Insets (10,10,10,10));
    grid.setVgap(8);
    grid.setHgap(8);
    
    Scene scene = new Scene(grid, 200, 200);
    Random aleatorio = new Random();
    
    Image image1 = new Image("images/x.gif");
    Image image2 = new Image("images/o.gif");
    
    ImageView display1 = new ImageView(image1);
    int x = aleatorio.nextInt((int)scene.getWidth());
    int y = aleatorio.nextInt((int) scene.getHeight());
    display1.xProperty().bind(scene.widthProperty());
    display1.yProperty().bind(scene.heightProperty()); 
    GridPane.setConstraints(display1, x, y);
    
    ImageView display2 = new ImageView(image2);
    int x2 = aleatorio.nextInt((int)grid.getWidth());
    int y2 = aleatorio.nextInt((int) grid.getHeight()); 
    display2.xProperty().bind(scene.widthProperty());
    display2.yProperty().bind(scene.heightProperty()); 
    GridPane.setConstraints(display2, x2, y2);
   
   
    grid.getChildren().addAll(display1, display2);
    grid.setAlignment(Pos.CENTER);
    
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
