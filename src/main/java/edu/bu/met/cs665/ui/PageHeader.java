package edu.bu.met.cs665.ui;

import java.util.Arrays;
import java.util.List;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class PageHeader extends TilePane {

  public PageHeader(double width) {
    setOrientation(Orientation.HORIZONTAL);
    setWidth(width);
    setPrefColumns(3);
    setTileAlignment(Pos.CENTER);

    List<Button> buttons = Arrays.asList(
        new Button("Homepage"),
        new Button("Blog"),
        new Button("Forum")
    );

    buttons.forEach(button -> button.setOnMouseClicked(new PageSwitcher()));

    getChildren().addAll(buttons);
  }
}
