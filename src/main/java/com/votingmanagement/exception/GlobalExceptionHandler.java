package com.votingmanagement.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {



   @ExceptionHandler(value=NoDuplicateEmailIdException.class)
    public ResponseEntity<ExceptionResponce> handleDuplicateEmailId(NoDuplicateEmailIdException e) {
        ExceptionResponce response = new ExceptionResponce();
        response.setErrorMsg("CONFLICT");
        response.setErrorCode(e.getMessage());
        response.setTimeStamp(LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
        }
   
   
   @ExceptionHandler(value=InvalidEmailIdException.class)
   public ResponseEntity<ExceptionResponce> InvalidEmailId(InvalidEmailIdException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
       }
   
   
   
   @ExceptionHandler(value=InvalidContactNumberException.class)
   public ResponseEntity<ExceptionResponce> InvalidContactNumber(InvalidContactNumberException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
       }
   
   
   
   @ExceptionHandler(value=WrongLoginException.class)
   public ResponseEntity<ExceptionResponce> WrongLogin(WrongLoginException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
       }
   
   @ExceptionHandler(value=CandidateNotFoundException.class)
   public ResponseEntity<ExceptionResponce> CandidateNotFound(CandidateNotFoundException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=VoterNotFoundException.class)
   public ResponseEntity<ExceptionResponce> VoterNotFoundException(VoterNotFoundException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=DuplicateException.class)
   public ResponseEntity<ExceptionResponce> DuplicateException(DuplicateException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=DuplicatePartyNameException.class)
   public ResponseEntity<ExceptionResponce> DuplicatePartyNameException(DuplicatePartyNameException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=InvalidElectionCardException.class)
   public ResponseEntity<ExceptionResponce> InvalidElectionCardException(InvalidElectionCardException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=InvalidCandidateNameException.class)
   public ResponseEntity<ExceptionResponce> InvalidCandidateNameException(InvalidCandidateNameException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }
   
   @ExceptionHandler(value=InvalidCandidatePartyNameException.class)
   public ResponseEntity<ExceptionResponce> InvalidCandidatePartyNameException(InvalidCandidatePartyNameException e) {
       ExceptionResponce response = new ExceptionResponce();
       response.setErrorMsg("CONFLICT");
       response.setErrorCode(e.getMessage());
       response.setTimeStamp(LocalDateTime.now());
       return new ResponseEntity<>(response, HttpStatus.CONFLICT);
   }


   }
