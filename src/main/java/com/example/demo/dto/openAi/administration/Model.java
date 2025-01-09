package com.example.demo.dto.openAi.administration;

import java.util.Objects;

public class Model {
	private String id;
	private String object;
	private Long created;
	private String owned_by;
	
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
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public String getOwned_by() {
		return owned_by;
	}
	public void setOwned_by(String owned_by) {
		this.owned_by = owned_by;
	}
	@Override
	public int hashCode() {
		return Objects.hash(created, id, object, owned_by);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		return Objects.equals(created, other.created) && Objects.equals(id, other.id)
				&& Objects.equals(object, other.object) && Objects.equals(owned_by, other.owned_by);
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", object=" + object + ", created=" + created + ", owned_by=" + owned_by + "]";
	}
}
