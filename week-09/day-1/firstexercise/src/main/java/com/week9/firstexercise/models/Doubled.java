package com.week9.firstexercise.models;

public class Doubled {

  private Integer received;
  private Integer result;

  public Doubled() {}

  public Doubled(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
