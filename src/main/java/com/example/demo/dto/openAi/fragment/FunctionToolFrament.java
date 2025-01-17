package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class FunctionToolFrament {
	private String type;
	private FunctionFragment function;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public FunctionFragment getFunction() {
		return function;
	}
	public void setFunction(FunctionFragment function) {
		this.function = function;
	}
	@Override
	public int hashCode() {
		return Objects.hash(function, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionToolFrament other = (FunctionToolFrament) obj;
		return Objects.equals(function, other.function) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "FunctionToolFrament [type=" + type + ", function=" + function + "]";
	}
}
