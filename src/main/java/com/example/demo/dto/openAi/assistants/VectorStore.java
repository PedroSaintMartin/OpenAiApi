package com.example.demo.dto.openAi.assistants;

import java.util.Map;
import java.util.Objects;

import com.example.demo.dto.openAi.fragment.ExpiresAfterFragment;
import com.example.demo.dto.openAi.fragment.FileCountsFragment;

public class VectorStore {
	private String id;
	private String object;
	private Long created_at;
	private String name;
	private Integer usage_bytes;
	private FileCountsFragment file_counts;
	private String status;
	private ExpiresAfterFragment expires_after;
	private Integer expires_at;
	private Long last_active_at;
	private Map<String, Object> metadata;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getUsage_bytes() {
		return usage_bytes;
	}
	public void setUsage_bytes(Integer usage_bytes) {
		this.usage_bytes = usage_bytes;
	}
	public FileCountsFragment getFile_counts() {
		return file_counts;
	}
	public void setFile_counts(FileCountsFragment file_counts) {
		this.file_counts = file_counts;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ExpiresAfterFragment getExpires_after() {
		return expires_after;
	}
	public void setExpires_after(ExpiresAfterFragment expires_after) {
		this.expires_after = expires_after;
	}
	public Integer getExpires_at() {
		return expires_at;
	}
	public void setExpires_at(Integer expires_at) {
		this.expires_at = expires_at;
	}
	public Long getLast_active_at() {
		return last_active_at;
	}
	public void setLast_active_at(Long last_active_at) {
		this.last_active_at = last_active_at;
	}
	public Map<String, Object> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}
	@Override
	public int hashCode() {
		return Objects.hash(created_at, expires_after, expires_at, file_counts, id, last_active_at, metadata, name,
				object, status, usage_bytes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VectorStore other = (VectorStore) obj;
		return Objects.equals(created_at, other.created_at) && Objects.equals(expires_after, other.expires_after)
				&& Objects.equals(expires_at, other.expires_at) && Objects.equals(file_counts, other.file_counts)
				&& Objects.equals(id, other.id) && Objects.equals(last_active_at, other.last_active_at)
				&& Objects.equals(metadata, other.metadata) && Objects.equals(name, other.name)
				&& Objects.equals(object, other.object) && Objects.equals(status, other.status)
				&& Objects.equals(usage_bytes, other.usage_bytes);
	}
	@Override
	public String toString() {
		return "VectorStore [id=" + id + ", object=" + object + ", created_at=" + created_at + ", name=" + name
				+ ", usage_bytes=" + usage_bytes + ", file_counts=" + file_counts + ", status=" + status
				+ ", expires_after=" + expires_after + ", expires_at=" + expires_at + ", last_active_at="
				+ last_active_at + ", metadata=" + metadata + "]";
	}
}
