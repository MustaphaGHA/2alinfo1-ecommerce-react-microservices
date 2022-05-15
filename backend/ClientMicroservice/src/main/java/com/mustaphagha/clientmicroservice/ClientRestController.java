package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ClientRestController {

    private ClientService clientService ;

    @GetMapping("/clients")
    public List<ClientEntity> fetchAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/client")
    public ClientEntity fetchClientUsingEmail(@RequestParam String email , @RequestParam String password) {
        ClientEntity client = clientService.fetchClientUsingEmail(email);
        if (client!=null) {
            if (client.getPassword().equals(password)) {
                return client;
            }
            else {
                return null ;
            }
        } else return null;

    }
}
