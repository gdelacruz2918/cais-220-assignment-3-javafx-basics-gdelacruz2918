/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:56:50 PM 
 */

package javafxbasics;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Class Exercise14_2
 * @author 
 */
public class Exercise14_2 extends Application {

  @Override
  public void start(Stage primaryStage) 
  {
      Stage window = primaryStage;
      
      //Creates grid pane
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(8);
      grid.setVgap(8);
      
      //Call image x & o
      Image x = new Image("images/x.gif");
      Image o = new Image("images/o.gif");
      
      Random aleatorio = new Random();
      int number;
      
      for(int i = 0; i < 3; i++)
      {
          for(int j = 0; j < 3; j++)
          {
              number = aleatorio.nextInt(3);
              if(number != 0)
              {
                  if(number == 1)
                  {
                  grid.add(new ImageView(x), i, j);
                  }
                  else
                  {
                  grid.add(new ImageView(o),i, j);
                  }
              }
          }
      }
      //Scene building & display
      Scene scene = new Scene(grid, 200, 200);
      window.setTitle("Tic Tac Toe");
      window.setScene(scene);
      window.show();
      
  }
  }