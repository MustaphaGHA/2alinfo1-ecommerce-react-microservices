package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
@AllArgsConstructor
public class ClientRestController {

    @Autowired
    private final ClientService clientService ;

    @GetMapping
    public List<ClientEntity> fetchAllClients() {
        return clientService.getAllClients();
    }
}
