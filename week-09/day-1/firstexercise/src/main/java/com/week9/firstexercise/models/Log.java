package com.week9.firstexercise.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(value = TemporalType.TIMESTAMP)
  private Date createdAt;

  private String endpoint;
  private String data;

  public Log() {}

  public Log(String endpoint, String data) {
    this.createdAt = new Date();
    this.endpoint = endpoint;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
