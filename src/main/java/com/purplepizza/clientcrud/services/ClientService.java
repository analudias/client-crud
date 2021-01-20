package com.purplepizza.clientcrud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.purplepizza.clientcrud.dto.ClientDTO;
import com.purplepizza.clientcrud.entities.Client;
import com.purplepizza.clientcrud.repositories.ClientRepository;
import com.purplepizza.clientcrud.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	public ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}

}
