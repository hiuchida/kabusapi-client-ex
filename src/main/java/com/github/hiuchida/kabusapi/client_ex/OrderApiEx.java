package com.github.hiuchida.kabusapi.client_ex;

import com.github.hiuchida.kabusapi.client_ex.model.SendOrderRequestEx;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.OrderApi;
import io.swagger.client.model.OrderSuccess;
import io.swagger.client.model.RequestCancelOrder;
import io.swagger.client.model.RequestSendOrder;

public class OrderApiEx {
	private OrderApi api;

	public OrderApiEx() {
		api = new OrderApi();
	}

	public OrderApiEx(ApiClient apiClient) {
		api = new OrderApi(apiClient);
	}

	public OrderSuccess cancelorderPut(String orderId, String password, String X_API_KEY) throws ApiException {
		RequestCancelOrder body = new RequestCancelOrder();
		body.setOrderId(orderId);
		body.setPassword(password);
		OrderSuccess response = api.cancelorderPut(body, X_API_KEY);
		return response;
	}

	public OrderSuccess sendorderPost(SendOrderRequestEx req, String password, String X_API_KEY)
			throws ApiException {
		RequestSendOrder body = req.toRequestSendOrder();
		body.setPassword(password);
		OrderSuccess response = api.sendorderPost(body, X_API_KEY);
		return response;
	}

}
