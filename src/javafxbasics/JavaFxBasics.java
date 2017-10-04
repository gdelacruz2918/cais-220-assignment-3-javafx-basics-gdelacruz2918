/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Sep 12, 2017 9:13:13 PM 
 */
package javafxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public abstract class JavaFxBasics extends Application {
  public static final String CLASSNAME_ARG="--className=";
  public static final String DEFAULT_CLASSNAME="Exercise14_16";
  
  /**
   * Main method of this application. Takes an optional command line parameter --className=<name>
   * where <name> is the name of the class to test. Example:
   * <pre>java -jar JavaFxBasics.jar --className=ButtonInPane</pre>
   * @param args optional argument specifying the class to test. 
   */
  public static void main(String[] args) {
    String className = null;
    if (args.length > 0)
    {
      if (args[0].startsWith(CLASSNAME_ARG)) {
        className = args[0].substring(CLASSNAME_ARG.length());
      }
    }
    
    if (className == null)
    {
      className = DEFAULT_CLASSNAME;
    }
    if (!className.contains("."))
    {
      StringBuilder stringBuilder = new StringBuilder(JavaFxBasics.class.getPackage().getName());
      stringBuilder.append('.').append(className);
      className = stringBuilder.toString();
    }
    try 
    {
      System.out.println("Launching " + className);
      launch((Class<? extends Application>)Class.forName(className), args);
    }
    catch(Exception ex)
    {
      System.out.println("Caught exception " + ex.toString());
      ex.printStackTrace();
    }
  }

}
