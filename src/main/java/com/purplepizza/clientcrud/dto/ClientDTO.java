package com.purplepizza.clientcrud.dto;

import com.purplepizza.clientcrud.entities.Client;

public class ClientDTO {
	
	private Long id;
	private String name;
	private String email;
	private String address;
	private Long phoneNumber;
	private Long cpf;
	private String sex;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String email, String address, Long phoneNumber, Long cpf, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.cpf = cpf;
		this.sex = sex;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		address = entity.getAddress();
		phoneNumber = entity.getPhoneNumber();
		cpf = entity.getCpf();
		sex = entity.getSex();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
