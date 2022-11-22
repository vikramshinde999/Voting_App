package com.votingmanagement.exception;

public class NoDuplicateEmailIdException extends Exception{
    public NoDuplicateEmailIdException (String message) {
        super(message);
    }
}
