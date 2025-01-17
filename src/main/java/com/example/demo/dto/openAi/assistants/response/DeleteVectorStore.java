package com.example.demo.dto.openAi.assistants.response;

import java.util.Objects;

import com.example.demo.dto.openAi.assistants.VectorStore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteVectorStore extends VectorStore {
	private Boolean deleted;

	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deleted);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeleteVectorStore other = (DeleteVectorStore) obj;
		return Objects.equals(deleted, other.deleted);
	}
	@Override
	public String toString() {
		return "DeleteVectorStore [deleted=" + deleted + "]";
	}
}
