package com.mustaphagha.clientmicroservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<ClientEntity,String> {
Optional<ClientEntity> findClientEntityByEmail(String email);
}
