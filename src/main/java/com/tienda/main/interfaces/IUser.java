package com.tienda.main.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.main.model.User;

@Repository
public interface IUser extends CrudRepository<User, Long> {

}
