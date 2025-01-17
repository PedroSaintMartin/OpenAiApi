package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class ToolResourcesFragment {
	private CodeInterpreterToolFragment codeInterpreterTool;
	private FileSearchFragment fileSearch;
	public CodeInterpreterToolFragment getCodeInterpreterTool() {
		return codeInterpreterTool;
	}
	public void setCodeInterpreterTool(CodeInterpreterToolFragment codeInterpreterTool) {
		this.codeInterpreterTool = codeInterpreterTool;
	}
	public FileSearchFragment getFileSearch() {
		return fileSearch;
	}
	public void setFileSearch(FileSearchFragment fileSearch) {
		this.fileSearch = fileSearch;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeInterpreterTool, fileSearch);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToolResourcesFragment other = (ToolResourcesFragment) obj;
		return Objects.equals(codeInterpreterTool, other.codeInterpreterTool)
				&& Objects.equals(fileSearch, other.fileSearch);
	}
	@Override
	public String toString() {
		return "ToolResourcesFragment [codeInterpreterTool=" + codeInterpreterTool + ", fileSearch=" + fileSearch + "]";
	}
}
