package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAllClientes();
    Cliente getClienteById(int id);
    Cliente saveCliente(Cliente cliente);
    void deleteCliente(int id);
}
