package com.example.demo.Repository;

import com.example.demo.Collections.Pets;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PetRepo extends MongoRepository<Pets, String> {
  Pets findBy_id(ObjectId _id);
}