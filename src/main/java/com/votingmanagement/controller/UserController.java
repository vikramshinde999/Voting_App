package com.votingmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.votingmanagement.exception.VoterNotFoundException;
import com.votingmanagement.model.User;
import com.votingmanagement.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
//	@PostMapping("/voter/post")
//	public String addVoter(@RequestBody Voter voter) throws DuplicateException, InvalidElectionCardException {
//		return userService.saveVoter(voter);
//	}
	
	@GetMapping("/user/get")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@DeleteMapping("/voter/delete/{electionCardId}")
	public String deleteUser (@PathVariable("electionCardId") Long electionCard) throws VoterNotFoundException {
		return userService.deleteUser(electionCard);
	} 
	
	@PutMapping("/voter/put/{userId}")
	public User updateUser(@PathVariable ("userId") Long userId, @RequestBody User user) throws VoterNotFoundException {
	return userService.updateUser(userId, user);
	}
	
}
