package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    
    public List<ClientEntity> getAllClients() {
        return clientRepository.findAll() ;
    }

    public ClientEntity fetchClientUsingEmail(String email){
        return clientRepository.findClientEntityByEmail(email);
    }
}
