package com.purplepizza.clientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purplepizza.clientcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
