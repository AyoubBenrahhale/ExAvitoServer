package dev.app.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.app.server.entities.User;
import dev.app.server.repository.userRepository;

@Service
public class UserServices {
	@Autowired
	userRepository userRepository;
	
	public User saveOrUpdateUser(User user) {
		return userRepository.save(user);
	}
	
	public User getByID(Long id) {
		User user=userRepository.getById(id);
		return user;
	}
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public Iterable<User> findAll(){
		return userRepository.findAll();
	}
}
