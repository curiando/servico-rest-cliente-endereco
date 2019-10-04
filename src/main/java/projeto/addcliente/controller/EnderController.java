package projeto.addcliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projeto.addcliente.entities.Endereco;
import projeto.addcliente.repository.EnderRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EnderController {

    @Autowired
    EnderRepository repository;

    @PostMapping(path = "endereco")
    public void insert(@RequestBody Endereco request) {

        repository.save(request);
    }
}