package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		
		Cliente cliente = clienteRepository.findOne(id);
		if (cliente == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
						+ ", Tipo: " + Cliente.class.getName());
		}
		
		return cliente;
	}
}
