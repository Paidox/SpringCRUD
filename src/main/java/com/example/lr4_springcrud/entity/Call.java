package com.example.lr4_springcrud.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "`call`")
public class Call
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "call_id", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "operator_id", nullable = false)
  private Operator operator;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client_id", nullable = false)
  private Client client;

  @Column(name = "call_datetime", nullable = false)
  @DateTimeFormat(pattern = "dd-MM-yyyy'T'HH:mm")
  private LocalDateTime callDatetime;

  @Column(name = "call_type", length = 256, nullable = false)
  private String callType;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id", nullable = false)
  private CallCategory category;

  @Column(name = "call_text", length = 256, nullable = false)
  private String callText;

  @Column(name = "call_status", length = 256, nullable = false)
  private String callStatus;

  public Call() {
  }

  public Call(Operator operator, Client client, LocalDateTime callDatetime, String callType, CallCategory category, String callText, String callStatus) {
    this.operator = operator;
    this.client = client;
    this.callDatetime = callDatetime;
    this.callType = callType;
    this.category = category;
    this.callText = callText;
    this.callStatus = callStatus;
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

  public LocalDateTime getCallDatetime() {
    return callDatetime;
  }

  public void setCallDatetime(LocalDateTime callDatetime) {
    this.callDatetime = callDatetime;
  }

  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public CallCategory getCategory() {
    return category;
  }

  public void setCategory(CallCategory category) {
    this.category = category;
  }

  public String getCallText() {
    return callText;
  }

  public void setCallText(String callText) {
    this.callText = callText;
  }

  public String getCallStatus() {
    return callStatus;
  }

  public void setCallStatus(String callStatus) {
    this.callStatus = callStatus;
  }
}