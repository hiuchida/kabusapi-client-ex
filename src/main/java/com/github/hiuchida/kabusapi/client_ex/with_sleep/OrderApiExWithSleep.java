package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import com.github.hiuchida.kabusapi.client_ex.OrderApiEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderFutureRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderOptionRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderRequestEx;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.OrderSuccess;

public class OrderApiExWithSleep {
	private OrderApiEx api;
	private boolean bInterrupted = false;

	public OrderApiExWithSleep() {
		api = new OrderApiEx();
	}

	public OrderApiExWithSleep(ApiClient apiClient) {
		api = new OrderApiEx(apiClient);
	}

	public OrderSuccess cancelorderPut(String orderId, String password, String X_API_KEY) throws ApiException {
		try {
			OrderSuccess response = api.cancelorderPut(orderId, password, X_API_KEY);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep5times();
		}
	}

	public OrderSuccess sendoderFuturePost(SendOrderFutureRequestEx req, String password, String X_API_KEY)
			throws ApiException {
		try {
			OrderSuccess response = api.sendoderFuturePost(req, password, X_API_KEY);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep5times();
		}
	}

	public OrderSuccess sendorderOptionPost(SendOrderOptionRequestEx req, String password, String X_API_KEY)
			throws ApiException {
		try {
			OrderSuccess response = api.sendorderOptionPost(req, password, X_API_KEY);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep5times();
		}
	}

	public OrderSuccess sendorderPost(SendOrderRequestEx req, String password, String X_API_KEY)
			throws ApiException {
		try {
			OrderSuccess response = api.sendorderPost(req, password, X_API_KEY);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep5times();
		}
	}

	public boolean isInterrupted() {
		return bInterrupted;
	}

}
