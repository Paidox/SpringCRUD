package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.Call;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CallRepository extends JpaRepository<Call, Integer>
{
  List<Call> findByFullNameContainingIgnoreCase(String fullName);

}
