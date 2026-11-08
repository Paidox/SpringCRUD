package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlacklistRepository extends JpaRepository<Blacklist, Integer>
{
  List<Blacklist> findByFullNameContainingIgnoreCase(String fullName);

}