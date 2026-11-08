package com.example.lr4_springcrud.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "blacklist")
public class Blacklist
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "blacklist_id", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "operator_id", nullable = false)
  private Operator operator;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id", unique = true, nullable = false)
  private Client client;

  @Column(name = "reason", length = 256, nullable = false)
  private String reason;

  @Column(name = "date_added", nullable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
  private LocalDateTime dateAdded;

  public Blacklist() {
  }

  public Blacklist(Operator operator, Client client, String reason, LocalDateTime dateAdded) {
    this.operator = operator;
    this.client = client;
    this.reason = reason;
    this.dateAdded = dateAdded;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public LocalDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(LocalDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }
}