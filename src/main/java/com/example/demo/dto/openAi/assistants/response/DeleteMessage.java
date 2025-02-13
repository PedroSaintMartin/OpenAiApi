package com.example.demo.dto.openAi.assistants.response;

import com.example.demo.dto.openAi.assistants.Message;

public class DeleteMessage extends Message{
	private Boolean deleted;

	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
}
