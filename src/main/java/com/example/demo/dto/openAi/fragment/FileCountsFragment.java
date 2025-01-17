package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class FileCountsFragment {
	private Integer in_progress;
	private Integer completed;
	private Integer cancelled;
	private Integer failed;
	private Integer total;
	public Integer getIn_progress() {
		return in_progress;
	}
	public void setIn_progress(Integer in_progress) {
		this.in_progress = in_progress;
	}
	public Integer getCompleted() {
		return completed;
	}
	public void setCompleted(Integer completed) {
		this.completed = completed;
	}
	public Integer getCancelled() {
		return cancelled;
	}
	public void setCancelled(Integer cancelled) {
		this.cancelled = cancelled;
	}
	public Integer getFailed() {
		return failed;
	}
	public void setFailed(Integer failed) {
		this.failed = failed;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cancelled, completed, failed, in_progress, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileCountsFragment other = (FileCountsFragment) obj;
		return Objects.equals(cancelled, other.cancelled) && Objects.equals(completed, other.completed)
				&& Objects.equals(failed, other.failed) && Objects.equals(in_progress, other.in_progress)
				&& Objects.equals(total, other.total);
	}
	@Override
	public String toString() {
		return "FileCountsFragment [in_progress=" + in_progress + ", completed=" + completed + ", cancelled="
				+ cancelled + ", failed=" + failed + ", total=" + total + "]";
	}
}
