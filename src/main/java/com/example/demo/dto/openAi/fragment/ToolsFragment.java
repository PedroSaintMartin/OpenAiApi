package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class ToolsFragment<T> {
	private T type;

	public T getType() {
		return type;
	}
	public void setType(T type) {
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
		ToolsFragment<?> other = (ToolsFragment<?>) obj;
		return Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "ToolsFragment [type=" + type + "]";
	}
	
}
