package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class ToolsFragment {
	private CodeInterpreterToolFragment codeInterpreterTool;
	private FileSearchToolFragment fileSearchTool;
	private FunctionToolFrament functionTool;
	public CodeInterpreterToolFragment getCodeInterpreterTool() {
		return codeInterpreterTool;
	}
	public void setCodeInterpreterTool(CodeInterpreterToolFragment codeInterpreterTool) {
		this.codeInterpreterTool = codeInterpreterTool;
	}
	public FileSearchToolFragment getFileSearchTool() {
		return fileSearchTool;
	}
	public void setFileSearchTool(FileSearchToolFragment fileSearchTool) {
		this.fileSearchTool = fileSearchTool;
	}
	public FunctionToolFrament getFunctionTool() {
		return functionTool;
	}
	public void setFunctionTool(FunctionToolFrament functionTool) {
		this.functionTool = functionTool;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeInterpreterTool, fileSearchTool, functionTool);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToolsFragment other = (ToolsFragment) obj;
		return Objects.equals(codeInterpreterTool, other.codeInterpreterTool)
				&& Objects.equals(fileSearchTool, other.fileSearchTool)
				&& Objects.equals(functionTool, other.functionTool);
	}
	@Override
	public String toString() {
		return "ToolsFragment [codeInterpreterTool=" + codeInterpreterTool + ", fileSearchTool=" + fileSearchTool
				+ ", functionTool=" + functionTool + "]";
	}
}
