package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.CallCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CallCategoryRepository extends JpaRepository<CallCategory, Integer>
{
  List<CallCategory> findByFullNameContainingIgnoreCase(String fullName);

}
