package com.example.demo.dto.openAi.fragment;

import java.util.Objects;

public class FileSearchFragment {
	private Integer maxNumResults;
	private RankingOptionsFragment rankingOptions;
	public Integer getMaxNumResults() {
		return maxNumResults;
	}
	public void setMaxNumResults(Integer maxNumResults) {
		this.maxNumResults = maxNumResults;
	}
	public RankingOptionsFragment getRankingOptions() {
		return rankingOptions;
	}
	public void setRankingOptions(RankingOptionsFragment rankingOptions) {
		this.rankingOptions = rankingOptions;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maxNumResults, rankingOptions);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileSearchFragment other = (FileSearchFragment) obj;
		return Objects.equals(maxNumResults, other.maxNumResults)
				&& Objects.equals(rankingOptions, other.rankingOptions);
	}
	@Override
	public String toString() {
		return "FileSearchFragment [maxNumResults=" + maxNumResults + ", rankingOptions=" + rankingOptions + "]";
	}
}
