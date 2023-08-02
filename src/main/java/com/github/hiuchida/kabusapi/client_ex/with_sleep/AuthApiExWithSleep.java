package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import com.github.hiuchida.kabusapi.client_ex.AuthApiEx;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.TokenSuccess;

public class AuthApiExWithSleep {
	private AuthApiEx api;

	public AuthApiExWithSleep() {
		api = new AuthApiEx();
	}

	public AuthApiExWithSleep(ApiClient apiClient) {
		api = new AuthApiEx(apiClient);
	}

	public TokenSuccess tokenPost(String apIPassword) throws ApiException, InterruptedException {
		try {
			TokenSuccess response = api.tokenPost(apIPassword);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

}
