package com.example.demo.dto.openAi.administration;

import com.example.demo.dto.openAi.fragment.ErrorFragment;

public class Error {
	private ErrorFragment error;

	public ErrorFragment getError() {
		return error;
	}
	public void setError(ErrorFragment error) {
		this.error = error;
	}
}
