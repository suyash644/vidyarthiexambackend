package com.vidyarti.examportal.helper;

public class UserNotFoundException extends  Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8488215778971206558L;

	public UserNotFoundException() {
        super("User with this username not found in database !!");
    }

    public UserNotFoundException(String msg) {
        super(msg);
    }

}
