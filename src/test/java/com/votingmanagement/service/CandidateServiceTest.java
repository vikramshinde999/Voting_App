package com.votingmanagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.votingmanagement.exception.CandidateNotFoundException;
import com.votingmanagement.exception.DuplicateException;
import com.votingmanagement.exception.DuplicatePartyNameException;
import com.votingmanagement.exception.InvalidCandidateNameException;
import com.votingmanagement.exception.InvalidCandidatePartyNameException;
import com.votingmanagement.model.Candidate;

public class CandidateServiceTest {
	
	@Autowired
	private CandidateService candidateService;
	
//	@Test
//	public void getAllCandidates() {
//		List<Candidate> candidates = new ArrayList<>();
//		candidates = candidateService.getAllCandidate();
//		assertEquals(candidates, candidateService.getAllCandidate());
//	}
	
	@Test
	public void deleteCandidateById() throws CandidateNotFoundException {
//		String result = candidateService.deleteCandidate(8L);
//		assertEquals("candidate successfully deleted",result);
		Boolean thrown=false;
		try {
			candidateService.deleteCandidate(45L);
		}
		catch (Exception e) {
			 thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void createCandidate() throws DuplicateException, InvalidCandidateNameException {
		Boolean thrown=false;
		try {
			candidateService.saveCandidate(null);
		}
		catch (Exception e) {
			thrown = true;
		}
			assertTrue(thrown);
	}
	
	@Test
	public void createCandidate1() throws DuplicateException, InvalidCandidateNameException, InvalidCandidatePartyNameException, DuplicatePartyNameException {
		Candidate candidate = new Candidate();
		candidate.setCandidateName("CandidateName");
		candidate.setCandidateParty("candidateParty");
		assertNotEquals("Candidate successfully added", candidateService.saveCandidate(candidate));
		
	}
	
	
	
//	@Mock
//	private CandidateRepository candidateRepository;
//	
//	@InjectMocks
//	private CandidateService candidateService;
//	private Candidate candidate;
//
//	
//	@Test
//	void getAllCandidates() {
//		candidateService.getAllCandidate();
//		verify(candidateRepository).findAll();
//	}
//	
//	@Test
//	void testCreateCandidate() {
//		Mockito.when(candidateRepository.save(candidate)).thenReturn(candidate);
//		assertThat(candidateService.createCandidate(candidate).containsAll(candidate);
//	}
//@Test
//public void testGetAllCandidate() {
//
//	List<Candidate> candidate = candidateRepository.findAll();
//	List<Candidate> candidates = new ArrayList<>();
//
//	for (Candidate candides : candidate) {
//		candidates.add(getCandidate(candides));
//	}
////	assertThat(candidateService.getAllCandidate()).containsAll(candidates);
//	assertEquals(0, 0);
//}
//
//private Candidate getCandidate(Candidate candidate) {
//	Candidate candidate1 = new Candidate();
//	candidate1.setCandidateName(candidate1.getCandidateName());
//	candidate1.setCandidateParty(candidate1.getCandidateParty());
//	candidate1.setImg(candidate1.getImg());
//	candidate1.setVote(candidate1.getVote());
//	return candidate1;
//}
}


