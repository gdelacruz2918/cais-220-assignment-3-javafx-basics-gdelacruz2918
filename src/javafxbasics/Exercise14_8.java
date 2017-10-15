/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:59:19 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Class Exercise14_8
 * @author 
 */
public class Exercise14_8 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
      Stage window = primaryStage;
      
      //Grid Pane
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(8);
      grid.setVgap(10);
      
      Integer num = 1;
      Image cards;
      
      for(int i = 0; i < 9; i++)
      {
          for(int j = 0; j < 6; j++)
          {
          cards = new Image("images/card/" + num + ".png");    
          grid.add(new ImageView(cards), i, j);
          num++;
          }
      }
      //Not exactly what I wanted, but... close enough
      
      //Scene & Stage Building
      Scene scene = new Scene(grid, 780, 650);
      window.setScene(scene);
      window.setTitle("Card Deck");
      window.show();
  }

}
