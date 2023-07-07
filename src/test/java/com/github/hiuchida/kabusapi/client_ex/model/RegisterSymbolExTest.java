package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;

import io.swagger.client.model.RequestRegisterSymbols;

public class RegisterSymbolExTest {

	@Test
	public void toRequestSendOrderTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RegisterSymbolEx o1 = new RegisterSymbolEx(symbol, exchange);

		RequestRegisterSymbols a1 = o1.toRequestRegisterSymbols();
		assertEquals(symbol, a1.getSymbol());
		assertNotNull(a1.getExchange());
		assertEquals(exchange.intValue(), (int) a1.getExchange());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RegisterSymbolEx o1 = new RegisterSymbolEx(symbol, exchange);

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
