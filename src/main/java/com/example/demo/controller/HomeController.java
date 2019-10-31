package com.example.demo.controller;

import java.util.List;

import com.example.demo.Collections.Pets;
import com.example.demo.Repository.PetRepo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

@Autowired
PetRepo repository;
	@GetMapping("/index")
	public String Home() {
		return "Hello";
	}
@RequestMapping(value = "/pets", method = RequestMethod.GET)
public List<Pets> getAllPets() {
  return repository.findAll();
}

// @RequestMapping(value = "/pets/{id}", method = RequestMethod.GET)
// public Pets getPetById(@PathVariable("id") ObjectId id) {
//   return repository.findBy_id(id);
// }
}
