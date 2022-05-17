package com.mustaphagha.clientmicroservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @Autowired
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ClientEntity> createClient(@RequestBody ClientEntity client) {
        return new ResponseEntity<>(clientService.addClient(client), HttpStatus.OK);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ClientEntity> updateClient(@PathVariable(value = "id") int id,
                                                   @RequestBody ClientEntity client){
        return new ResponseEntity<>(clientService.updateClient(id, client), HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteClient(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(clientService.deleteClient(id), HttpStatus.OK);
    }
}
