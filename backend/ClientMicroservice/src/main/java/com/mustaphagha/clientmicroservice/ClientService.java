package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    
    public List<ClientEntity> getAllClients() {
        return clientRepository.findAll() ;
    }
}
