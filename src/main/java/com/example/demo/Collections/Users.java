package com.example.demo.Collections;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "user_cred")
public class Users {
 @Id
  public ObjectId _id;

  public String name;
  public String pass;
  public String email;

}
