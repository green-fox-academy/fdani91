package com.week9.firstexercise.models;

public class DoUntil {

  private int until;
  private int result;

  public DoUntil() {}

  public DoUntil(Until until, String action) {
    if (action.equals("sum")) {
      this.until = until.getUntil();
      this.result = sum(until.getUntil());
    } else if (action.equals("factor")) {
      this.until = until.getUntil();
      this.result = factor(until.getUntil());
    }
  }

  public int factor(int until) {
    int c = 1;
    for (int i = 1; i <= until; i++) {
      c = c * i;
    }
    return c;
  }

  public int sum(int until) {
    int c = 0;
    for (int i = 0; i <= until; i++) {
      c = c + i;
    }
    return c;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
