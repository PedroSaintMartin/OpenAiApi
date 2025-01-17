package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class FunctionFragment {
	private String description;
	private String name;
	private Object parameters; // Need to Refactor, it is diferent from the documentation
	private Boolean strict;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getParameters() {
		return parameters;
	}
	public void setParameters(Object parameters) {
		this.parameters = parameters;
	}
	public Boolean getStrict() {
		return strict;
	}
	public void setStrict(Boolean strict) {
		this.strict = strict;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, name, parameters, strict);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionFragment other = (FunctionFragment) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& Objects.equals(parameters, other.parameters) && Objects.equals(strict, other.strict);
	}
	@Override
	public String toString() {
		return "FunctionFragment [description=" + description + ", name=" + name + ", parameters=" + parameters
				+ ", strict=" + strict + "]";
	}
}
