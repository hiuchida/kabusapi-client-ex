package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;

import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegisterSymbols;

public class RegistSuccessExTest {

	@Test
	public void newRegistSuccessWrapperTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RequestRegisterSymbols item1 = new RequestRegisterSymbols();
		item1.setSymbol(symbol);
		item1.setExchange(exchange.intValue());

		RegistSuccess rs = new RegistSuccess();
		rs.addRegistListItem(item1);

		RegistSuccessEx a1 = new RegistSuccessEx(rs);
		assertEquals(1, a1.getRegistList().size());
		RegisterSymbolEx w1 = a1.getRegistList().get(0);
		assertEquals(symbol, w1.getSymbol());
		assertEquals(exchange, w1.getExchange());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeCode exchange = ExchangeCode.東証;

		RequestRegisterSymbols item1 = new RequestRegisterSymbols();
		item1.setSymbol(symbol);
		item1.setExchange(exchange.intValue());

		RegistSuccess rs = new RegistSuccess();
		rs.addRegistListItem(item1);

		RegistSuccessEx o1 = new RegistSuccessEx(rs);

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
