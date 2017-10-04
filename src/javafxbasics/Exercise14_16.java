/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 9:02:01 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Class Exercise14_16
 * @author 
 */
public class Exercise14_16 extends Application {

  @Override
  public void start(Stage primaryStage){
      primaryStage.setTitle("Exercise14_16");
      
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setPadding(new Insets(10,10,10,10));
      grid.setVgap(10);
      grid.setHgap(10);
      
      
  }

}
