package com.bean.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColor {

  private Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("This is RED in color.");
  }
}
