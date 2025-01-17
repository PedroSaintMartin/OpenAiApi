package com.example.demo.dto.openAi.assistants.request;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import com.example.demo.dto.openAi.fragment.ExpiresAfterFragment;

public class CreateVectorStore {
	private String[] file_ids;
	private String name;
	private ExpiresAfterFragment expires_after;
	//private ChunkingStrategyFragment chunking_strategy; Implementation needed
	private Map<String, Object> metadata;
	public String[] getFile_ids() {
		return file_ids;
	}
	public void setFile_ids(String[] file_ids) {
		this.file_ids = file_ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExpiresAfterFragment getExpires_after() {
		return expires_after;
	}
	public void setExpires_after(ExpiresAfterFragment expires_after) {
		this.expires_after = expires_after;
	}
	public Map<String, Object> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(file_ids);
		result = prime * result + Objects.hash(expires_after, metadata, name);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateVectorStore other = (CreateVectorStore) obj;
		return Objects.equals(expires_after, other.expires_after) && Arrays.equals(file_ids, other.file_ids)
				&& Objects.equals(metadata, other.metadata) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "CreateVectorStore [file_ids=" + Arrays.toString(file_ids) + ", name=" + name + ", expires_after="
				+ expires_after + ", metadata=" + metadata + "]";
	}
}
