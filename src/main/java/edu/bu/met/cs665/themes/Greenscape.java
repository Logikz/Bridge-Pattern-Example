package edu.bu.met.cs665.themes;

public class Greenscape implements Theme {

  @Override
  public String getStyle() {
    return getClass().getResource("/css/greenscape.css").toExternalForm();
  }
}
