package com.liyibo1110.abstractfactory;

public class OrcArmy implements Army {

  static final String DESCRIPTION = "This is the orc army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
