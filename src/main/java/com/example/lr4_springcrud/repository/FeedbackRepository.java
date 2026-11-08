package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>
{
  List<Feedback> findByFullNameContainingIgnoreCase(String fullName);

}
