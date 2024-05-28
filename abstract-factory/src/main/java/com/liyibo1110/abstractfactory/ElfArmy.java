package com.liyibo1110.abstractfactory;

public class ElfArmy implements Army {

  static final String DESCRIPTION = "This is the elven army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
