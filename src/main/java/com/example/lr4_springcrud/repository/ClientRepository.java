package com.example.lr4_springcrud.repository;

import com.example.lr4_springcrud.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer>
{
  List<Client> findByFullNameContainingIgnoreCase(String fullName);
}