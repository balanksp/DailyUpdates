package com.springboot.Backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private String resourceName;
	private String fieldNmae;
	private Object fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldNmae, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'",resourceName,fieldNmae,fieldValue));
		this.resourceName = resourceName;
		this.fieldNmae = fieldNmae;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}


	public String getFieldNmae() {
		return fieldNmae;
	}


	public Object getFieldValue() {
		return fieldValue;
	}

		
	
	
}
