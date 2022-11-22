package com.votingmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votingmanagement.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

	Candidate findByCandidateName(String candidateName);

	Candidate findByCandidateParty(String candidateParty);

	
}
