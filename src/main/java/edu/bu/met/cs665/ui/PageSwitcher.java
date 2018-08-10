package edu.bu.met.cs665.ui;

import edu.bu.met.cs665.themes.Theme;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PageSwitcher implements EventHandler<MouseEvent> {

  @Override
  public void handle(MouseEvent event) {
    Button source = (Button) event.getSource();

    switch (source.getText()) {
      case "Homepage":
        new Homepage((Theme) source.getScene().getUserData()).render(
            (Stage) source.getScene().getWindow());
        break;
      case "Blog":
        new Blog((Theme) source.getScene().getUserData()).render(
            (Stage) source.getScene().getWindow());
        break;
      case "Forum":
        new Forum((Theme) source.getScene().getUserData()).render(
            (Stage) source.getScene().getWindow());
        break;
    }
  }
}