package edu.bu.met.cs665;


import edu.bu.met.cs665.themes.Light;
import edu.bu.met.cs665.ui.Homepage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {



  /**
   * A main method to run examples.
   * 
   * @param args not used
   */
  public static void main(String[] args) {
    launch(args);

  }

  @Override
  public void start(Stage stage) throws Exception {
    Homepage start = new Homepage(new Light());
    setUserAgentStylesheet(null);
    start.render(stage);
  }
}
