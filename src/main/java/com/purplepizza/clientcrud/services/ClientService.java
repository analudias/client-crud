package com.purplepizza.clientcrud.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

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
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = clientRepository.getOne(id);
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setAddress(dto.getAddress());
			entity.setPhoneNumber(dto.getPhoneNumber());
			entity.setCpf(dto.getCpf());
			entity.setSex(dto.getSex());
			return new ClientDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found: " +id);
		}
	}
	
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setAddress(dto.getAddress());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setCpf(dto.getCpf());
		entity.setSex(dto.getSex());
		entity = clientRepository.save(entity);
		return new ClientDTO(entity);
	}

}
