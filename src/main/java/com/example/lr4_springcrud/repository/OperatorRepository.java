package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatorRepository extends JpaRepository<Operator, Integer>
{
  List<Operator> findByFullNameContainingIgnoreCase(String fullName);

}
