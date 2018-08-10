package edu.bu.met.cs665.themes;

public class Light implements Theme {

  @Override
  public String getStyle() {
    return getClass().getResource("/css/light.css").toExternalForm();
  }
}
