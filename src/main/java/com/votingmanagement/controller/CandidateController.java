package com.votingmanagement.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.votingmanagement.exception.CandidateNotFoundException;
import com.votingmanagement.exception.DuplicateException;
import com.votingmanagement.exception.DuplicatePartyNameException;
import com.votingmanagement.exception.InvalidCandidateNameException;
import com.votingmanagement.exception.InvalidCandidatePartyNameException;
import com.votingmanagement.model.Candidate;
import com.votingmanagement.service.CandidateService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/candidate/post")
	@RolesAllowed("ROLE_ADMIN")
	public Candidate addCandidate(@RequestBody Candidate candidate) {
//			throws DuplicateException, InvalidCandidateNameException, InvalidCandidatePartyNameException, DuplicatePartyNameException{
		return candidateService.saveCandidate(candidate);
	}
	
	
	@GetMapping("/candidate/get")
	public List<Candidate> getAllCandidate(){
		return candidateService.getAllCandidate();
	}
	
	@DeleteMapping("/delete/{candidateId}")
		public String deleteCandidate( @PathVariable("candidateId")Long candidateId) throws CandidateNotFoundException{
			return candidateService.deleteCandidate(candidateId);
			
		}
	
	@PutMapping("/put/{candidateId}")
	public Candidate updateCandidate(@PathVariable ("candidateId") Long candidateId) throws CandidateNotFoundException {
		return candidateService.updateCandidate(candidateId);
	}

}
