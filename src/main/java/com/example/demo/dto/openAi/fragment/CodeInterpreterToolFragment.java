package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class CodeInterpreterToolFragment {
	private String type;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeInterpreterToolFragment other = (CodeInterpreterToolFragment) obj;
		return Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "CodeInterpreterTool [type=" + type + "]";
	}
}
