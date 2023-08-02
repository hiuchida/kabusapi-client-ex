package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.SendOrderFutureRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderOptionRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderRequestEx;
import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.deliv.ExchangeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.deliv.TradeTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.CashmarginStockCode;
import com.github.hiuchida.kabusapi.enums.stock.DelivTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.ExchangeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FrontOrderTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FundTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.SecurityTypeSCode;

public class OrderApiExWithSleepTest {

	private final OrderApiExWithSleep api = new OrderApiExWithSleep();

	@Test
	public void cancelorderPutTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.cancelorderPut("orderId", "xxxxxx", X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);

		assertFalse(api.isInterrupted());
	}

	@Test
	public void sendoderFuturePostTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			SendOrderFutureRequestEx body = new SendOrderFutureRequestEx();
			body.symbol("symbol").exchange(ExchangeDCode.日中).tradeType(TradeTypeCode.新規);
			body.timeInForce(TimeInForceCode.FAK).side(SideCode.買).qty(0);
			body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
			body.frontOrderType(FrontOrderTypeDCode.成行).price(0.0).expireDay(0);
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.sendoderFuturePost(body, "xxxxxx", X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);

		assertFalse(api.isInterrupted());
	}

	@Test
	public void sendorderOptionPostTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			SendOrderOptionRequestEx body = new SendOrderOptionRequestEx();
			body.symbol("symbol").exchange(ExchangeDCode.日中).tradeType(TradeTypeCode.新規);
			body.timeInForce(TimeInForceCode.FAK).side(SideCode.買).qty(0);
			body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
			body.frontOrderType(FrontOrderTypeDCode.成行).price(0.0).expireDay(0);
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.sendorderOptionPost(body, "xxxxxx", X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);

		assertFalse(api.isInterrupted());
	}

	@Test
	public void sendorderPostTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			SendOrderRequestEx body = new SendOrderRequestEx();
			body.symbol("symbol").exchange(ExchangeSCode.東証).securityType(SecurityTypeSCode.株式);
			body.side(SideCode.買).cashMargin(CashmarginStockCode.新規).marginTradeType(MarginTradeTypeCode.制度信用);
			body.marginPremiumUnit(12.3).delivType(DelivTypeCode.指定なし);
			body.fundType(FundTypeCode.信用代用);
			body.accountType(AccountTypeCode.特定).qty(0);
			body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
			body.frontOrderType(FrontOrderTypeSCode.成行);
			body.price(0.0).expireDay(0);
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.sendorderPost(body, "xxxxxx", X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);

		assertFalse(api.isInterrupted());
	}

}
