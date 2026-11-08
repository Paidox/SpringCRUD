package com.example.lr4_springcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "operator")
public class Operator {
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "operator_fullname")
  private String fullName;

  @Column(name = "processing_time")
  private int processingTime;

  @Column(name = "count_calls")
  private int countCalls;

  @Column(name = "finishedCalls")
  private int finishedCalls;

  public Operator() {
  }

  public Operator(Integer id, String fullName, int processingTime, int count_calls, int finished_calls) {
    this.id = id;
    this.fullName = fullName;
    this.processingTime = processingTime;
    this.countCalls = count_calls;
    this.finishedCalls = finished_calls;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(int processingTime) {
    this.processingTime = processingTime;
  }

  public int getCountCalls() {
    return countCalls;
  }

  public void setCountCalls(int count_calls) {
    this.countCalls = count_calls;
  }

  public int getFinishedCalls() {
    return finishedCalls;
  }

  public void setFinishedCalls(int finished_calls) {
    this.finishedCalls = finished_calls;
  }
}