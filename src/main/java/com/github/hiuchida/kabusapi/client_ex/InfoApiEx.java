package com.github.hiuchida.kabusapi.client_ex;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.kabusapi.client_ex.model.BoardSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.OrdersSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.PositionsSuccessEx;
import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.ProductCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.InfoApi;
import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.BoardSuccess;
import io.swagger.client.model.OrdersSuccess;
import io.swagger.client.model.PositionsSuccess;
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

	public BoardSuccessEx boardGet(String X_API_KEY, String symbol, ExchangeCode ec) throws ApiException {
		String symbolStr = symbol + "@" + ec.toString();
		BoardSuccess response = api.boardGet(X_API_KEY, symbolStr);
		return new BoardSuccessEx(response);
	}

	public List<OrdersSuccessEx> ordersGet(String X_API_KEY, ProductCode product, String id, String updtime, String details, String symbol, StateOCode state, SideCode side, CashmarginOCode cashmargin)
			throws ApiException {
		String productStr = (product != null) ? product.toString() : null;
		String stateStr = (state != null) ? state.toString() : null;
		String sideStr = (side != null) ? side.toString() : null;
		String cashmarginStr = (cashmargin != null) ? cashmargin.toString() : null;
		List<OrdersSuccess> response = api.ordersGet(X_API_KEY, productStr, id, updtime, details, symbol, stateStr, sideStr, cashmarginStr);
		List<OrdersSuccessEx> list = new ArrayList<>();
		for (OrdersSuccess os : response) {
			OrdersSuccessEx item = new OrdersSuccessEx(os);
			list.add(item);
		}
		return list;
	}

	public List<PositionsSuccessEx> positionsGet(String X_API_KEY, ProductCode product, String symbol, SideCode side, String addinfo)
			throws ApiException {
		String productStr = (product != null) ? product.toString() : null;
		String sideStr = (side != null) ? side.toString() : null;
		List<PositionsSuccess> response = api.positionsGet(X_API_KEY, productStr, symbol, sideStr, addinfo);
		if (response == null) {
			return null;
		}
		List<PositionsSuccessEx> list = new ArrayList<>();
		for (PositionsSuccess ps : response) {
			PositionsSuccessEx item = new PositionsSuccessEx(ps);
			list.add(item);
		}
		return list;
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
