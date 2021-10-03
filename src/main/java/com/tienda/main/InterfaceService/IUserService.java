package com.tienda.main.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tienda.main.model.User;

public interface IUserService {

	public List<User> listar();
	public Optional<User> listarPorId (Long id);
	public int save(User u);
	public void delete(Long id);
	
}
