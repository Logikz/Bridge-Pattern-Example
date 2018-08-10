package edu.bu.met.cs665.ui;

import java.util.Arrays;
import java.util.List;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class ThemeFooter extends TilePane {

  public ThemeFooter(double width) {
    setOrientation(Orientation.HORIZONTAL);
    setWidth(width);
    setPrefColumns(3);
    setTileAlignment(Pos.CENTER);

    List<Button> buttons = Arrays.asList(
        new Button("Light"),
        new Button("Dark"),
        new Button("Greenscape")
    );

    buttons.forEach(button -> button.setOnMouseClicked(new ThemeSwitcher()));

    getChildren().addAll(buttons);
  }


}
