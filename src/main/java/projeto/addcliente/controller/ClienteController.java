package projeto.addcliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projeto.addcliente.entities.Clientes;
import projeto.addcliente.repository.ClienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClienteController {

    @Autowired
    ClienteRepository repository;

    @PostMapping(path = "clientes")
    public void insert(@RequestBody Clientes request) {

        repository.save(request);
    }
}