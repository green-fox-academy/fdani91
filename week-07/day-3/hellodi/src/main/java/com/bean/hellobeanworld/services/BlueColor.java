package com.bean.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("BlueColor")
public class BlueColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is BLUE in color.");
  }
}
