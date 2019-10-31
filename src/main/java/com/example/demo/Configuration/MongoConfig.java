package com.example.demo.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


class MongoConfig{

MongoClientURI uri = new MongoClientURI(
    "mongodb+srv://admin:tadmin@cluster0-svh55.mongodb.net/test?retryWrites=true&w=majority");
MongoClient mongoClient = new MongoClient(uri);
MongoDatabase database = mongoClient.getDatabase("test");
}
