package com.github.lucspb.vendas.service;

import com.github.lucspb.vendas.model.Cliente;
import com.github.lucspb.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente c){
        validarCliente(c);
        this.repository.save(c);
    }

    public void validarCliente(Cliente c){
        // aplica validacoes
    }
}
