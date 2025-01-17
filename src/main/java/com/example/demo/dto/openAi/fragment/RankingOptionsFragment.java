package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class RankingOptionsFragment {
	private String ranker;
	private Double scoreThreshold;
	public String getRanker() {
		return ranker;
	}
	public void setRanker(String ranker) {
		this.ranker = ranker;
	}
	public Double getScoreThreshold() {
		return scoreThreshold;
	}
	public void setScoreThreshold(Double scoreThreshold) {
		this.scoreThreshold = scoreThreshold;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ranker, scoreThreshold);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RankingOptionsFragment other = (RankingOptionsFragment) obj;
		return Objects.equals(ranker, other.ranker) && Objects.equals(scoreThreshold, other.scoreThreshold);
	}
	@Override
	public String toString() {
		return "RankingOptionsFragment [ranker=" + ranker + ", scoreThreshold=" + scoreThreshold + "]";
	}
}
