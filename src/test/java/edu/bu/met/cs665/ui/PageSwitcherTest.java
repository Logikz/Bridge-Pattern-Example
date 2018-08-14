package edu.bu.met.cs665.ui;

import edu.bu.met.cs665.themes.Light;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit.ApplicationTest;

public class PageSwitcherTest extends ApplicationTest {

  @Override
  public void start(Stage stage) throws Exception {
    Homepage start = new Homepage(new Light());
    start.render(stage);
    stage.show();
  }

  @Test
  public void testPageSwitchingButtons() {
    //How to test UI app?
    //clickOn("#BlogButton");
  }
}
