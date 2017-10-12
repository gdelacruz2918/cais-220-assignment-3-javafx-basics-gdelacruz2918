/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 9:01:02 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Class Exercise14_13
 * @author 
 */
public class Exercise14_13 extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
  Stage window = primaryStage;
  
  BorderPane pane = new BorderPane();
 
    Arc arc1 = new Arc(150, 100, 80, 80, 30, 35); // Create an arc
    arc1.setFill(Color.RED); // Set fill color
    arc1.setType(ArcType.ROUND); // Set arc type
    
    Arc arc2 = new Arc(150, 100, 80, 80, 30 + 90, 35); // Create an arc
    arc2.setFill(Color.RED); // Set fill color
    arc2.setType(ArcType.ROUND); // Set arc type
   
    Arc arc3 = new Arc(150, 100, 80, 80, 30 + 180, 35); // Create an arc
    arc3.setFill(Color.RED); // Set fill color
    arc3.setType(ArcType.ROUND); // Set arc type
  
    Arc arc4 = new Arc(150, 100, 80, 80, 30 + 270, 35); // Create an arc
    arc4.setFill(Color.RED); // Set fill color
    arc4.setType(ArcType.ROUND); // Set arc type
   
    Arc arc5 = new Arc();
    //-------
    //Create a group and add nodes to the group
    Group group = new Group();
    group.getChildren().addAll(new Text(210, 40, "arc1: round"), arc1);
//-------
  Scene scene = new Scene(group, 250, 250);
  window.setScene(scene);
  window.setTitle("Pie Chart");
  window.show();
  }

}
