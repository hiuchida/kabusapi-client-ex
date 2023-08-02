package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import java.util.List;

import com.github.hiuchida.kabusapi.client_ex.InfoApiEx;
import com.github.hiuchida.kabusapi.client_ex.model.BoardSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.OrdersSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.PositionsSuccessEx;
import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.ProductCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.OptionCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.SymbolNameSuccess;

public class InfoApiExWithSleep {
	private InfoApiEx api;
	private boolean bInterrupted = false;

	public InfoApiExWithSleep() {
		api = new InfoApiEx();
	}

	public InfoApiExWithSleep(ApiClient apiClient) {
		api = new InfoApiEx(apiClient);
	}

	public ApiSoftLimitResponse apisoftlimitGet(String X_API_KEY) throws ApiException {
		try {
			ApiSoftLimitResponse response = api.apisoftlimitGet(X_API_KEY);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public BoardSuccessEx boardGet(String X_API_KEY, String symbol, ExchangeCode ec) throws ApiException {
		try {
			BoardSuccessEx response = api.boardGet(X_API_KEY, symbol, ec);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public List<OrdersSuccessEx> ordersGet(String X_API_KEY, ProductCode product, String id, String updtime, String details, String symbol, StateOCode state, SideCode side, CashmarginOCode cashmargin)
			throws ApiException {
		try {
			List<OrdersSuccessEx> response = api.ordersGet(X_API_KEY, product, id, updtime, details, symbol, state, side, cashmargin);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public List<PositionsSuccessEx> positionsGet(String X_API_KEY, ProductCode product, String symbol, SideCode side, String addinfo)
			throws ApiException {
		try {
			List<PositionsSuccessEx> response = api.positionsGet(X_API_KEY, product, symbol, side, addinfo);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public SymbolNameSuccess symbolnameFutureGet(String X_API_KEY, Integer derivMonth, FutureCode futureCode)
			throws ApiException {
		try {
			SymbolNameSuccess response = api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCode);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public SymbolNameSuccess symbolnameOptionGet(String X_API_KEY, Integer derivMonth, PutOrCallCode putOrCall, Integer strikePrice)
			throws ApiException {
		SymbolNameSuccess response = this.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice, null);
		return response;
	}

	public SymbolNameSuccess symbolnameOptionGet(String X_API_KEY, Integer derivMonth, PutOrCallCode putOrCall, Integer strikePrice, OptionCode optionCode)
			throws ApiException {
		try {
			SymbolNameSuccess response = api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice, optionCode);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public SymbolNameSuccess symbolnameOptionMiniGet(String X_API_KEY, Integer derivMonth, Integer derivWeekly, PutOrCallCode putOrCall, Integer strikePrice)
			throws ApiException {
		try {
			SymbolNameSuccess response = api.symbolnameOptionMiniGet(X_API_KEY, derivMonth, derivWeekly, putOrCall, strikePrice);
			return response;
		} finally {
			bInterrupted |= SleepUtil.sleep10times();
		}
	}

	public boolean isInterrupted() {
		return bInterrupted;
	}

}
