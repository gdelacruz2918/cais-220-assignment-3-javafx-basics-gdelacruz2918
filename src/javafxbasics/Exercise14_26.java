/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 9:02:46 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Class Exercise14_26
 * @author 
 */
public class Exercise14_26 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
      Stage window = primaryStage;
      window.setTitle("Clock Pane");
      
      GridPane pane = new GridPane();
      pane.setPadding(new Insets(10,10,10,10));
      pane.setHgap(10);
      pane.setAlignment(Pos.CENTER);
      
      
      HBox hbox = new HBox(pane);
      Scene scene = new Scene(hbox, 300, 300);
      window.setScene(scene);
      window.show();
  }
}
