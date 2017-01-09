package com.hello.main.starter;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmploeeRequest {
	@Id
	private String id;
	private String content;
	private STATUS status;
	
	public EmploeeRequest(){
		
	}
	
	public EmploeeRequest(String content){
		this.id = UUID.randomUUID().toString();
		this.content = content;
		this.status = STATUS.NEW;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
}
