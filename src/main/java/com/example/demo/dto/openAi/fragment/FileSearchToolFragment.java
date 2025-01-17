package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class FileSearchToolFragment {
	private String type;
	private FileSearchFragment fileSearch;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public FileSearchFragment getFileSearch() {
		return fileSearch;
	}
	public void setFileSearch(FileSearchFragment fileSearch) {
		this.fileSearch = fileSearch;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fileSearch, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileSearchToolFragment other = (FileSearchToolFragment) obj;
		return Objects.equals(fileSearch, other.fileSearch) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "FileSearchToolFragment [type=" + type + ", fileSearch=" + fileSearch + "]";
	}
}
