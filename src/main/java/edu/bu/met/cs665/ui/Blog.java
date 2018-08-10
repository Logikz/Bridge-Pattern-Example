package edu.bu.met.cs665.ui;

import edu.bu.met.cs665.themes.Theme;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Blog implements Page {

  private final Theme theme;

  public Blog(Theme theme) {
    this.theme = theme;
  }

  @Override
  public void render(Stage stage) {
    BorderPane borderPane = new BorderPane();

    borderPane.setMinHeight(500);
    borderPane.setMinWidth(500);

    borderPane.setTop(new PageHeader(borderPane.getWidth()));
    borderPane.setCenter(new Text("Welcome to my Blog!"));
    borderPane.setBottom(new ThemeFooter(borderPane.getWidth()));

    Scene scene = new Scene(borderPane);

    scene.getStylesheets().add(theme.getStyle());
    scene.setUserData(theme);

    stage.setScene(scene);
    stage.setTitle("Homepage");
    stage.show();
  }
}
