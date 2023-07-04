package com.github.hiuchida.kabusapi.client_ex;

import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.InfoApi;
import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.SymbolNameSuccess;

public class InfoApiEx {
	private InfoApi api;

	public InfoApiEx() {
		api = new InfoApi();
	}

	public InfoApiEx(ApiClient apiClient) {
		api = new InfoApi(apiClient);
	}

	public ApiSoftLimitResponse apisoftlimitGet(String X_API_KEY) throws ApiException {
		ApiSoftLimitResponse response = api.apisoftlimitGet(X_API_KEY);
		return response;
	}

	public SymbolNameSuccess symbolnameFutureGet(String X_API_KEY, Integer derivMonth, FutureCode futureCode)
			throws ApiException {
		String futureCodeStr = (futureCode != null) ? futureCode.toString() : null;
		SymbolNameSuccess response = api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCodeStr);
		return response;
	}

	public SymbolNameSuccess symbolnameOptionGet(String X_API_KEY, Integer derivMonth, PutOrCallCode putOrCall, Integer strikePrice)
			throws ApiException {
		String putOrCallStr = (putOrCall != null) ? putOrCall.toString() : null;
		SymbolNameSuccess response = api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCallStr, strikePrice);
		return response;
	}

}
