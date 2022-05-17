package com.mustaphagha.clientmicroservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<ClientEntity,String> {
ClientEntity findClientEntityByEmail(String email);
ClientEntity findById(int id);
String deleteById(int id);
}
