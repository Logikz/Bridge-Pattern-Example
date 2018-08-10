package edu.bu.met.cs665.ui;

import edu.bu.met.cs665.themes.Dark;
import edu.bu.met.cs665.themes.Greenscape;
import edu.bu.met.cs665.themes.Light;
import edu.bu.met.cs665.themes.Theme;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ThemeSwitcher implements EventHandler<MouseEvent> {

  @Override
  public void handle(MouseEvent event) {
    Button source = (Button) event.getSource();

    Theme theme;
    switch (source.getText()) {
      case "Dark":
        source.getScene().getStylesheets().clear();
        theme = new Dark();
        source.getScene().setUserData(theme);
        source.getScene().getStylesheets().add(theme.getStyle());
        break;
      case "Light":
        source.getScene().getStylesheets().clear();
        theme = new Light();
        source.getScene().setUserData(theme);
        source.getScene().getStylesheets().add(theme.getStyle());
        break;
      case "Greenscape":
        source.getScene().getStylesheets().clear();
        theme = new Greenscape();
        source.getScene().setUserData(theme);
        source.getScene().getStylesheets().add(theme.getStyle());
        break;
    }
  }
}