package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    
    public List<ClientEntity> getAllClients() {
        return clientRepository.findAll() ;
    }

    public ClientEntity fetchClientUsingEmail(String email){
        return clientRepository.findClientEntityByEmail(email);
    }

    public ClientEntity addClient(ClientEntity client) {
        return clientRepository.save(client);
    }
    public ClientEntity updateClient(int id, ClientEntity newClient) {
        if (clientRepository.findById(id)!=null) {
            ClientEntity existingClient = clientRepository.findById(id);
            existingClient.setLastName(newClient.getLastName());
            existingClient.setFirstName(newClient.getFirstName());
            existingClient.setEmail(newClient.getEmail());

            return clientRepository.save(existingClient);
        } else
            return null;
    }
    public String deleteClient(int id) {
        if (clientRepository.findById(id)!=null) {
            clientRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }
}
