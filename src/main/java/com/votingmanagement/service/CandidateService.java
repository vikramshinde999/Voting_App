package com.votingmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votingmanagement.exception.CandidateNotFoundException;
import com.votingmanagement.exception.DuplicateException;
import com.votingmanagement.exception.DuplicatePartyNameException;
import com.votingmanagement.exception.InvalidCandidateNameException;
import com.votingmanagement.exception.InvalidCandidatePartyNameException;
import com.votingmanagement.model.Candidate;
import com.votingmanagement.repository.CandidateRepository;

@Service
public class CandidateService {
	@Autowired
	private CandidateRepository candidateRepository;


	public Candidate saveCandidate(Candidate candidate) {
//			throws DuplicateException, InvalidCandidateNameException,
//			InvalidCandidatePartyNameException, DuplicatePartyNameException {

//   _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ Invalid Candidate Name -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 

//		String candidateName = candidate.getCandidateName();
//
//		String regexName = "^[A-Za-z]{2,15} [A-za-z]{0,30}$";
//
//		boolean nameResult = candidateName.matches(regexName);
//
//		if (!nameResult)
//			throw new InvalidCandidateNameException(candidate.getCandidateName() + " not a valid name");
//
//		// _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ Invalid party Name
//		// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
//		String candidateParty = candidate.getCandidateParty();
//
//		String regexParty = "^[A-Za-z]{2,15}$";
//
//		boolean partyResult = candidateParty.matches(regexParty);
//
//		if (!partyResult)
//			throw new InvalidCandidatePartyNameException(candidate.getCandidateParty() + " not a valid party name");
//
////   _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ Check duplicate candidate -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 
//
//		Candidate checkCandidate = candidateRepository.findByCandidateName(candidate.getCandidateName());
//
//		if (checkCandidate != null)
//			throw new DuplicatePartyNameException("Candidate already exist in the party");
//
//		else {
			return candidateRepository.save(candidate);
//			return "Candidate successfully added";
//		}

	}

	
	public List<Candidate> getAllCandidate() {
		return candidateRepository.findAll();
	}


	public String deleteCandidate(Long candidateId) throws CandidateNotFoundException {

		Optional<Candidate> optionalCandidate = candidateRepository.findById(candidateId);
		if (!optionalCandidate.isPresent()) {
			throw new CandidateNotFoundException("candidate not found exception");
		}
		candidateRepository.deleteById(candidateId);
		return "candidate successfully deleted";
	}


	public Candidate updateCandidate(Long candidateId) throws CandidateNotFoundException {
		try {
			Optional<Candidate> findCandidate = candidateRepository.findById(candidateId);
			if (findCandidate.isEmpty())
				throw new CandidateNotFoundException("Candidate not found");
		} catch (Exception e) {
			throw new CandidateNotFoundException("Candidate not found");
		}

		Candidate getcandidatebyId = candidateRepository.findById(candidateId).get();
		// getcandidatebyId.setCandidateName(candidate.getCandidateName());
		// getcandidatebyId.setCandidateParty(candidate.getCandidateParty());
		// getcandidatebyId.setImg(candidate.getImg());
		getcandidatebyId.setVote((getcandidatebyId.getVote()) + 1);

		return candidateRepository.save(getcandidatebyId);
	}
	
//	public Candidate createCandidate(Candidate candidate) {
//		return candidateRepository.save(candidate);
//	}

}
