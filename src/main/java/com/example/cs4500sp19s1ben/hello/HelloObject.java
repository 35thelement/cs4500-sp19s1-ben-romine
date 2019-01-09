package com.example.cs4500sp19s1ben.hello;

public class HelloObject {
	// This is the message that will be used in the object's functions.
	private String message;

	// Return the message of this object.
	public String getMessage() {
		return this.message;
	}

	// Set the message of this object to the provided message.
	public void setMessage(String message) {
		this.message = message;
	}

	// Construct a HelloObject with a provided message.
	public HelloObject(String message) {
		this.message = message;
	}

	// Construct a HelloObject with no initial message.
	public HelloObject() {

	}
}
