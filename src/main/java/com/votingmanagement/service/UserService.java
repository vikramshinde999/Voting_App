package com.votingmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votingmanagement.exception.DuplicateException;
import com.votingmanagement.exception.InvalidElectionCardException;
import com.votingmanagement.exception.VoterNotFoundException;
import com.votingmanagement.model.User;
import com.votingmanagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
//	public String saveUser(User user)throws DuplicateException, InvalidElectionCardException {
//		
////	_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ validation election card _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
//			
//			String electionCard = user.getElectionCard();
//			
//			String regex = "^[A-Z]{3}[0-9]{7}$";
//			
//			boolean result = electionCard.matches(regex);
//			
//			if(!result)
//				throw new InvalidElectionCardException(user.getElectionCard() + " Card is not valid");
//		
//
////	_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ Check duplicate election card _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
//		
//		User checkVoter = userRepository.findByElectionCard(user.getElectionCard()); 
//		if (checkVoter!= null) 
//			throw new DuplicateException("Election card already exist");
//		
//		else {
//			userRepository.save(user);
//			return "Voter successfully added";
//		}
//		 
//	}
	
	public String deleteUser(Long electionCardId) throws VoterNotFoundException {
		
		Optional<User> findVoter = (userRepository.findById(electionCardId));
		
		if(!findVoter.isPresent()) {
			throw new VoterNotFoundException(" User not found");
		}
		else {
		userRepository.deleteById(electionCardId);
		return "User successfully deleted";
		}
		
	}
	
	  public List<User> getAllUser() {
	        return userRepository.findAll();
	    }
	  
	  public User updateUser(Long userId, User user)throws VoterNotFoundException {
		  Optional<User> findVoter = userRepository.findById(userId);
		  if (!findVoter.isPresent())
			  throw new VoterNotFoundException("User not found");
		  
		  User getUserById = userRepository.findById(userId).get();
//		  	getUserById.setElectionCard(user.getElectionCard());
		  	getUserById.setAddress(user.getAddress());
		  	getUserById.setUserContact(user.getUserContact());
		  	getUserById.setUsername(user.getUsername());
		  	
		  return userRepository.saveAndFlush(getUserById);
	  }
}
