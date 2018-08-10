package edu.bu.met.cs665.themes;

public class Dark implements Theme {

  @Override
  public String getStyle() {
    return getClass().getResource("/css/dark.css").toExternalForm();
  }
}
