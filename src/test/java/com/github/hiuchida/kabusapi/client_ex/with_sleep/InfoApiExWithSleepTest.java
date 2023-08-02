package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.ProductCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.OptionCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

public class InfoApiExWithSleepTest {

	private final InfoApiExWithSleep api = new InfoApiExWithSleep();

	@Test
	public void apisoftlimitGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.apisoftlimitGet(X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void boardGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			String symbol = "symbol";
			ExchangeCode ec = ExchangeCode.東証;
			api.boardGet(X_API_KEY, symbol, ec);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void ordersGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			ProductCode product = null;
			String id = null;
			String updtime = null;
			String details = null;
			String symbol = null;
			StateOCode state = null;
			SideCode side = null;
			CashmarginOCode cashmargin = null;
			api.ordersGet(X_API_KEY, product, id, updtime, details, symbol, state, side, cashmargin);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void positionsGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			ProductCode product = null;
			String symbol = null;
			SideCode side = null;
			String addinfo = null;
			api.positionsGet(X_API_KEY, product, symbol, side, addinfo);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void symbolnameFutureGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			Integer derivMonth = 0;
			FutureCode futureCode = FutureCode.日経225mini先物;
			api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCode);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void symbolnameOptionGetTest_5_19_1() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			Integer derivMonth = 0;
			PutOrCallCode putOrCall = PutOrCallCode.CALL;
			Integer strikePrice = 0;
			api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void symbolnameOptionGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			Integer derivMonth = 0;
			PutOrCallCode putOrCall = PutOrCallCode.CALL;
			Integer strikePrice = 0;
			OptionCode optionCode = OptionCode.日経225オプション;
			api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice, optionCode);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void symbolnameOptionMiniGetTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			Integer derivMonth = 0;
			Integer derivWeekly = 0;
			PutOrCallCode putOrCall = PutOrCallCode.CALL;
			Integer strikePrice = 0;
			api.symbolnameOptionMiniGet(X_API_KEY, derivMonth, derivWeekly, putOrCall, strikePrice);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

}
