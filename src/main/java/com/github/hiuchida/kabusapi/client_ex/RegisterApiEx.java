package com.github.hiuchida.kabusapi.client_ex;

import java.util.List;

import com.github.hiuchida.kabusapi.client_ex.model.RegistSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.RegisterSymbolEx;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.RegisterApi;
import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegister;
import io.swagger.client.model.RequestRegisterSymbols;
import io.swagger.client.model.RequestUnregister;
import io.swagger.client.model.UnregisterAllSuccess;

public class RegisterApiEx {
	private RegisterApi api;

	public RegisterApiEx() {
		api = new RegisterApi();
	}

	public RegisterApiEx(ApiClient apiClient) {
		api = new RegisterApi(apiClient);
	}

	public RegistSuccessEx registerPut(RegisterSymbolEx req, String X_API_KEY) throws ApiException {
		RequestRegister body = new RequestRegister();
		RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
		body.addSymbolsItem(rrs);
		RegistSuccess response = api.registerPut(body, X_API_KEY);
		return new RegistSuccessEx(response);
	}

	public RegistSuccessEx registerPut(List<RegisterSymbolEx> reqList, String X_API_KEY) throws ApiException {
		RequestRegister body = new RequestRegister();
		for (RegisterSymbolEx req : reqList) {
			RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
			body.addSymbolsItem(rrs);
		}
		RegistSuccess response = api.registerPut(body, X_API_KEY);
		return new RegistSuccessEx(response);
	}

	public UnregisterAllSuccess unregisterAllPut(String X_API_KEY) throws ApiException {
		UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);
		return response;
	}

	public RegistSuccessEx unregisterPut(RegisterSymbolEx req, String X_API_KEY) throws ApiException {
		RequestUnregister body = new RequestUnregister();
		RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
		body.addSymbolsItem(rrs);
		RegistSuccess response = api.unregisterPut(body, X_API_KEY);
		return new RegistSuccessEx(response);
	}

	public RegistSuccessEx unregisterPut(List<RegisterSymbolEx> reqList, String X_API_KEY) throws ApiException {
		RequestUnregister body = new RequestUnregister();
		for (RegisterSymbolEx req : reqList) {
			RequestRegisterSymbols rrs = req.toRequestRegisterSymbols();
			body.addSymbolsItem(rrs);
		}
		RegistSuccess response = api.unregisterPut(body, X_API_KEY);
		return new RegistSuccessEx(response);
	}

}
