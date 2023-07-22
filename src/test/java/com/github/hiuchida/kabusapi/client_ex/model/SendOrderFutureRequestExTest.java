package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.commons.UnderOverCode;
import com.github.hiuchida.kabusapi.enums.deliv.AfterHitOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.ExchangeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.deliv.TradeTypeCode;

import io.swagger.client.model.RequestSendOrderDerivFuture;

public class SendOrderFutureRequestExTest {

	@Test
	public void toRequestSendOrderDerivFutureTest() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		
		SendOrderFutureRequestEx o1 = new SendOrderFutureRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setFrontOrderType(frontOrderType);
		
		RequestSendOrderDerivFuture a1 = o1.toRequestSendOrderDerivFuture();
		assertEquals(symbol, a1.getSymbol());
		assertNotNull(a1.getExchange());
		assertEquals(exchange.intValue(), (int) a1.getExchange());
		assertNotNull(a1.getTradeType());
		assertEquals(tradeType.intValue(), (int) a1.getTradeType());
		assertNotNull(a1.getTimeInForce());
		assertEquals(timeInForce.intValue(), (int) a1.getTimeInForce());
		assertEquals(side.toString(), a1.getSide());
		assertNotNull(a1.getFrontOrderType());
		assertEquals(frontOrderType.intValue(), (int) a1.getFrontOrderType());
	}

	@Test
	public void toRequestSendOrderDerivFutureTest2() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeDCode afterHitOrderType = AfterHitOrderTypeDCode.指値;
		Double afterHitPrice = 12.1;
		
		SendOrderFutureRequestEx o1 = new SendOrderFutureRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		RequestSendOrderDerivFuture a1 = o1.toRequestSendOrderDerivFuture();
		assertEquals(symbol, a1.getSymbol());
		assertNotNull(a1.getExchange());
		assertEquals(exchange.intValue(), (int) a1.getExchange());
		assertNotNull(a1.getTradeType());
		assertEquals(tradeType.intValue(), (int) a1.getTradeType());
		assertNotNull(a1.getTimeInForce());
		assertEquals(timeInForce.intValue(), (int) a1.getTimeInForce());
		assertEquals(side.toString(), a1.getSide());
		assertEquals(qty, a1.getQty());
		assertNotNull(a1.getClosePositionOrder());
		assertEquals(closePositionOrder.intValue(), (int) a1.getClosePositionOrder());
		assertEquals(2, a1.getClosePositions().size());
		assertEquals(holdID1, a1.getClosePositions().get(0).getHoldID());
		assertEquals(qty1, a1.getClosePositions().get(0).getQty());
		assertEquals(holdID2, a1.getClosePositions().get(1).getHoldID());
		assertEquals(qty2, a1.getClosePositions().get(1).getQty());
		assertNotNull(a1.getFrontOrderType());
		assertEquals(frontOrderType.intValue(), (int) a1.getFrontOrderType());
		assertEquals(price, a1.getPrice());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(triggerPrice, a1.getReverseLimitOrder().getTriggerPrice());
		assertNotNull(a1.getReverseLimitOrder().getUnderOver());
		assertEquals(underOver.intValue(), (int) a1.getReverseLimitOrder().getUnderOver());
		assertNotNull(a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitOrderType.intValue(), (int) a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitPrice, a1.getReverseLimitOrder().getAfterHitPrice());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		
		SendOrderFutureRequestEx o1 = new SendOrderFutureRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setFrontOrderType(frontOrderType);
		
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toStringTest2() {
		String symbol = "symbol";
		ExchangeDCode exchange = ExchangeDCode.日中;
		TradeTypeCode tradeType = TradeTypeCode.新規;
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		SideCode side = SideCode.買;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeDCode frontOrderType = FrontOrderTypeDCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeDCode afterHitOrderType = AfterHitOrderTypeDCode.指値;
		Double afterHitPrice = 12.1;
		
		SendOrderFutureRequestEx o1 = new SendOrderFutureRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setTradeType(tradeType);
		o1.setTimeInForce(timeInForce);
		o1.setSide(side);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toIndentedStringTest() {
		SendOrderFutureRequestEx o1 = new SendOrderFutureRequestEx();
		o1.setClosePositions(null);
		o1.reverseLimitOrder(null);
		o1.setReverseLimitOrder(null);
		assertNull(o1.getSymbol());
		assertNull(o1.getExchange());
		assertNull(o1.getTradeType());
		assertNull(o1.getTimeInForce());
		assertNull(o1.getSide());
		assertNull(o1.getQty());
		assertNull(o1.getClosePositionOrder());
		assertNull(o1.getClosePositions());
		assertNull(o1.getFrontOrderType());
		assertNull(o1.getPrice());
		assertNull(o1.getExpireDay());
		assertNull(o1.getReverseLimitOrder());

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
