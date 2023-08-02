package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import java.util.List;

import com.github.hiuchida.kabusapi.client_ex.RegisterApiEx;
import com.github.hiuchida.kabusapi.client_ex.model.RegistSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.RegisterSymbolEx;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.UnregisterAllSuccess;

public class RegisterApiExWithSleep {
	private RegisterApiEx api;

	public RegisterApiExWithSleep() {
		api = new RegisterApiEx();
	}

	public RegisterApiExWithSleep(ApiClient apiClient) {
		api = new RegisterApiEx(apiClient);
	}

	public RegistSuccessEx registerPut(RegisterSymbolEx req, String X_API_KEY) throws ApiException, InterruptedException {
		try {
			RegistSuccessEx response = api.registerPut(req, X_API_KEY);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

	public RegistSuccessEx registerPut(List<RegisterSymbolEx> reqList, String X_API_KEY) throws ApiException, InterruptedException {
		try {
			RegistSuccessEx response = api.registerPut(reqList, X_API_KEY);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

	public UnregisterAllSuccess unregisterAllPut(String X_API_KEY) throws ApiException, InterruptedException {
		try {
			UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

	public RegistSuccessEx unregisterPut(RegisterSymbolEx req, String X_API_KEY) throws ApiException, InterruptedException {
		try {
			RegistSuccessEx response = api.unregisterPut(req, X_API_KEY);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

	public RegistSuccessEx unregisterPut(List<RegisterSymbolEx> reqList, String X_API_KEY) throws ApiException, InterruptedException {
		try {
			RegistSuccessEx response = api.unregisterPut(reqList, X_API_KEY);
			return response;
		} finally {
			SleepUtil.sleep10times();
		}
	}

}
