package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class ExpiresAfterFragment {
	private String anchor;
	private Integer days;
	public String getAnchor() {
		return anchor;
	}
	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anchor, days);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpiresAfterFragment other = (ExpiresAfterFragment) obj;
		return Objects.equals(anchor, other.anchor) && Objects.equals(days, other.days);
	}
	@Override
	public String toString() {
		return "ExpiresAfterFragment [anchor=" + anchor + ", days=" + days + "]";
	}
}
