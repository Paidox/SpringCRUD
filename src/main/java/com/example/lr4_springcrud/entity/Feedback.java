package com.example.lr4_springcrud.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
public class Feedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "feedback_id", nullable = false)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "operator_id", nullable = false)
  private Operator operator;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id", nullable = false)
  private Client client;

  @Column(name = "feedback_datetime", nullable = false)
  @DateTimeFormat(pattern = "dd-MM-yyyy'T'HH:mm")
  private LocalDateTime feedbackDatetime;

  @Column(name = "rating", nullable = false)
  private int rating;

  @Column(name = "review", length = 256)
  private String review;

  public Feedback() {
  }

  public Feedback(Operator operator, Client client, LocalDateTime feedbackDatetime, int rating, String review) {
    this.operator = operator;
    this.client = client;
    this.feedbackDatetime = feedbackDatetime;
    this.rating = rating;
    this.review = review;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDateTime getFeedbackDatetime() {
    return feedbackDatetime;
  }

  public void setFeedbackDatetime(LocalDateTime feedbackDatetime) {
    this.feedbackDatetime = feedbackDatetime;
  }

  int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }
}