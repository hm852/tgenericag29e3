package com.tienda.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.main.InterfaceService.IUserService;
import com.tienda.main.interfaces.IUser;
import com.tienda.main.model.User;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUser data;
	
	@Override
	public List<User> listar() {
		
		
		
		return (List<User>) data.findAll();
	}

	@Override
	public Optional<User> listarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
