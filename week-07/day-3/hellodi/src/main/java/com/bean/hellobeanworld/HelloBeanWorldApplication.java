package com.bean.hellobeanworld;

import com.bean.hellobeanworld.services.BlueColor;
import com.bean.hellobeanworld.services.MyColor;
import com.bean.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor color;

  @Autowired
  HelloBeanWorldApplication(Printer printer, @Qualifier("RedColor") MyColor color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}
