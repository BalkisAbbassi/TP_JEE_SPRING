package com.epi.miniproject.web;


import com.epi.miniproject.dao.entity.Client;
import com.epi.miniproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addClient(@RequestBody Client client){ clientService.addClient(client);}

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public void updateClient(@RequestBody Client client) { clientService.updateClient(client);}
    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Long id) { clientService.deleteClient(id);}

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/all")
    public List<Client> getAllClient(){
        return clientService.getAll();

    }
}
