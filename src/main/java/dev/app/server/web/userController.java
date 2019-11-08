package dev.app.server.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.app.server.entities.User;
import dev.app.server.services.UserServices;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/user")
public class userController {
	
	@Autowired
	UserServices userServices;
	
	
	@PostMapping
	public void addIntern(@Valid @RequestBody User user) {
		User newIntern = userServices.saveOrUpdateUser(user);
		System.out.println("Successfully added");
	}
	
	@PutMapping("/{id}")
	public void UpdateTask(@Valid @RequestBody User user ) {
		userServices.saveOrUpdateUser(user);
		System.out.println("Successfully Updating");
	}
	
	@GetMapping
	public Iterable<User> getUsers(){
		return userServices.findAll();
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id){
		 userServices.delete(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getByID(@PathVariable Long id) throws Exception{
		if(id<0){
			throw new Exception("Invalid ID");
		}
		try{User user=userServices.getByID(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);}
		catch(Exception e){
			throw new Exception("Can't find any task with ID " +id);
		}
	}
}
