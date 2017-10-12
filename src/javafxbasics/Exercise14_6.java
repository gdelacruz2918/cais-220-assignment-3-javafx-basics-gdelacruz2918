/*
 * Westfield State University: CAIS 220: Program Design II
 * (c) 2017
 * Created: Sep 17, 2017 8:57:53 PM 
 */

package javafxbasics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
      
    Group group1 = new Group();
    Group group2 = new Group();
    Group group3 = new Group();
    Group group4 = new Group();
    Group group5 = new Group();
    Group group6 = new Group();
    Group group7 = new Group();
    Group group8 = new Group();
    
    
    for(int i =0; i <4; i++)
    {
        Rectangle r1 = new Rectangle (25, 10, 55, 55);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        r1.setX(i *110);
        //
        Rectangle r2 = new Rectangle(80, 10, 55, 55);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.BLACK);
        r2.setX(55 + i * 110);
        //
        Rectangle r3 = new Rectangle (80, 10, 55, 55);
        r3.setStroke(Color.BLACK);
        r3.setFill(Color.WHITE);
        r3.setX(55 + i *110);
        //
        Rectangle r4 = new Rectangle(25, 10, 55, 55);
        r4.setStroke(Color.BLACK);
        r4.setFill(Color.BLACK);
        r4.setX(i *110);
        //
        Rectangle r5 = new Rectangle (25, 10, 55, 55);
        r5.setStroke(Color.BLACK);
        r5.setFill(Color.WHITE);
        r5.setX(i *110);
        //
        Rectangle r6 = new Rectangle(80, 10, 55, 55);
        r6.setStroke(Color.BLACK);
        r6.setFill(Color.BLACK);
        r6.setX(55 + i * 110);
        //
        Rectangle r7 = new Rectangle (80, 10, 55, 55);
        r7.setStroke(Color.BLACK);
        r7.setFill(Color.WHITE);
        r7.setX(55 + i *110);
        //
        Rectangle r8 = new Rectangle(25, 10, 55, 55);
        r8.setStroke(Color.BLACK);
        r8.setFill(Color.BLACK);
        r8.setX(i *110);
        //--------------------------------------------------------------------------
        Rectangle r9 = new Rectangle (25, 10, 55, 55);
        r9.setStroke(Color.BLACK);
        r9.setFill(Color.WHITE);
        r9.setX(i *110);
        //
        Rectangle r10 = new Rectangle(80, 10, 55, 55);
        r10.setStroke(Color.BLACK);
        r10.setFill(Color.BLACK);
        r10.setX(55 + i * 110);
        //
        Rectangle r11 = new Rectangle (80, 10, 55, 55);
        r11.setStroke(Color.BLACK);
        r11.setFill(Color.WHITE);
        r11.setX(55 + i *110);
        //
        Rectangle r12 = new Rectangle(25, 10, 55, 55);
        r12.setStroke(Color.BLACK);
        r12.setFill(Color.BLACK);
        r12.setX(i *110);
        //
        Rectangle r13 = new Rectangle (25, 10, 55, 55);
        r13.setStroke(Color.BLACK);
        r13.setFill(Color.WHITE);
        r13.setX(i *110);
        //
        Rectangle r14 = new Rectangle(80, 10, 55, 55);
        r14.setStroke(Color.BLACK);
        r14.setFill(Color.BLACK);
        r14.setX(55 + i * 110);
        //
        Rectangle r15 = new Rectangle (80, 10, 55, 55);
        r15.setStroke(Color.BLACK);
        r15.setFill(Color.WHITE);
        r15.setX(55 + i *110);
        //
        Rectangle r16 = new Rectangle(25, 10, 55, 55);
        r16.setStroke(Color.BLACK);
        r16.setFill(Color.BLACK);
        r16.setX(i *110);
    //--------------------------------------------------------------------------
    group1.getChildren().addAll(r1, r2);
    group2.getChildren().addAll(r3,r4);
    group3.getChildren().addAll(r5,r6);
    group4.getChildren().addAll(r7,r8);
    group5.getChildren().addAll(r9,r10);
    group6.getChildren().addAll(r11,r12);
    group7.getChildren().addAll(r13,r14);
    group8.getChildren().addAll(r15,r16); 
    }  
    VBox vbox = new VBox();
    vbox.setAlignment(Pos.CENTER);
    vbox.getChildren().addAll(group1,group2,group3,group4,
                              group5,group6,group7,group8);

    BorderPane border = new BorderPane(vbox);
      
    Scene scene = new Scene(border, 500, 500);
    window.setTitle("ShowRectangle"); // Set the stage title
    window.setScene(scene); // Place the scene in the stage
    window.show(); // Display the stage
  }

}

