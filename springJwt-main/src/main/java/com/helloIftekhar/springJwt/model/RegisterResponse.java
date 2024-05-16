package com.helloIftekhar.springJwt.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterResponse {

	 @JsonProperty("message")
	    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RegisterResponse(String message) {
		super();
		this.message = message;
	}
	 
}
