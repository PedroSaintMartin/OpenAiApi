package com.example.demo.dto.openAi.assistants;

import java.util.Objects;

public class Thread {
	private String id;
	private String object;
	private Long created_at;
	private Object metadata;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public Long getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Long created_at) {
		this.created_at = created_at;
	}
	public Object getMetadata() {
		return metadata;
	}
	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}
	@Override
	public int hashCode() {
		return Objects.hash(created_at, id, metadata, object);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thread other = (Thread) obj;
		return Objects.equals(created_at, other.created_at) && Objects.equals(id, other.id)
				&& Objects.equals(metadata, other.metadata) && Objects.equals(object, other.object);
	}
	@Override
	public String toString() {
		return "Thread [id=" + id + ", object=" + object + ", created_at=" + created_at + ", metadata=" + metadata
				+ "]";
	}
}
