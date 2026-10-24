package com.example.lr4_springcrud.controller;

import org.springframework.ui.Model;
import com.example.lr4_springcrud.entity.Client;
import com.example.lr4_springcrud.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
class AppController
{
  private ClientRepository clientRepository;

  public AppController(ClientRepository clientRepository)
  {
    this.clientRepository = clientRepository;
  }

  @GetMapping("/")
  public String mainPage(Model model)
  {
    model.addAttribute("clients", clientRepository.findAll());
    model.addAttribute("client", new Client());
    return "index";
  }

  @GetMapping("/search")
  public String Search(@RequestParam("keyword") String keyword, Model model)
  {
    List<Client> clients = clientRepository.findByFullNameContainingIgnoreCase(keyword);
    model.addAttribute("clients", clients);
    model.addAttribute("client", new Client());
    model.addAttribute("keyword", keyword);
    return "index";
  }

  @PostMapping("/clients")
  public String saveClient(@ModelAttribute("client") Client client)
  {
    clientRepository.save(client);
    return "redirect:/";
  }

  @GetMapping("/clients/delete/{id}")
  public String deleteClient(@PathVariable int id)
  {
    clientRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/clients/update/{id}")
  public String showFormForUpdate(@PathVariable("id") int id, Model model) {
    Client client = clientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id: " + id));
    model.addAttribute("clients", clientRepository.findAll());
    model.addAttribute("client", client);
    return "index";
  }
}