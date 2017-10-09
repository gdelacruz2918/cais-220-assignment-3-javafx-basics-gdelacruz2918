/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:57:53 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Class Exercise14_6
 * @author 
 */
public class Exercise14_6 extends Application {

  @Override
  public void start(Stage window) 
  {
    //Board
//    Rectangle r1 = new Rectangle (25, 10);
//    r1.setStroke(Color.BLACK);
//    r1.setFill(Color.WHITE);
      
    Group group = new Group();  
      
    for(int i =0; i <4; i++)
    {
    Rectangle r1 = new Rectangle (25, 10, 55, 55);
    r1.setStroke(Color.BLACK);
    r1.setFill(Color.WHITE);
    r1.setX(i *110);
    
    
    Rectangle r2 = new Rectangle(80, 10, 55, 55);
    r2.setStroke(Color.BLACK);
    r2.setFill(Color.BLACK);
    r2.setX(55 + i * 110);
    
    Rectangle r3 = new Rectangle (0, 10, 55, 55);
    r3.setStroke(Color.BLACK);
    r3.setFill(Color.WHITE);
    r3.setY( i *110);
    
    Rectangle r4 = new Rectangle(0, 25, 55, 55);
    r4.setStroke(Color.BLACK);
    r4.setFill(Color.BLACK);
    r4.setY(55 + i *110);    
    
    group.getChildren().addAll(r1, r2, r3, r4);
    
    }
      
    
    //GridPane grid = new GridPane(group);
    BorderPane border = new BorderPane(group);
      
    Scene scene = new Scene(border, 500, 500);
    window.setTitle("ShowRectangle"); // Set the stage title
    window.setScene(scene); // Place the scene in the stage
    window.show(); // Display the stage
  }

}

